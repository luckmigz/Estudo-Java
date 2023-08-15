import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Auth {
    public static boolean auth(User user) {
        try (Connection connection = Conn.connect()) {
            String query = "SELECT * FROM login_senha WHERE usuario = ? AND senha = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getUser());
            preparedStatement.setString(2, user.getsPass());
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
