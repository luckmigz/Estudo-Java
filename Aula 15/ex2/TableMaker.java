import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class TableMaker extends JFrame {
    private JTable tabela;
    private Local local = new Local();

    public TableMaker() {
        setTitle(local.getLang().getString("table.title"));
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        tabela = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabela);
        getContentPane().add(scrollPane);

        carregarDados();
    }

    private void carregarDados() {
        Vector<String> colunas = new Vector<>();
        colunas.add("ID");
        colunas.add(local.getLang().getString("table.userid"));
        colunas.add(local.getLang().getString("table.grade"));
        colunas.add(local.getLang().getString("table.absence"));
        colunas.add(local.getLang().getString("table.attdate"));

        Vector<Vector<Object>> dados = new Vector<>();

        try (Connection connection = Conn.connect()) {
            String query = "SELECT * FROM notas_faltas";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Vector<Object> linha = new Vector<>();
                linha.add(resultSet.getInt("id"));
                linha.add(resultSet.getInt("usuario_id"));
                linha.add(resultSet.getDouble("nota"));
                linha.add(resultSet.getInt("faltas"));
                linha.add(resultSet.getObject("data_atualizacao"));
                dados.add(linha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        tabela.setModel(new DefaultTableModel(dados, colunas));
    }
}