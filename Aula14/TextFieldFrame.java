package Aula14;

// Demonstrando a classe JTextField
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
{  private JTextField textField1; // Campo texto com tamanho
   private JTextField textField2; // Campo texto com texto
   private JTextField textField3; // Campo texto com texto e tamanho
   private JPasswordField passwordField; // Campo senha com texto
   // Construtor TextFieldFrame adiciona JTextFields ao JFrame
   public TextFieldFrame()
   {  super( "JTextField e JPasswordField" );
      setLayout( new FlowLayout() ); // configura layout do frame
      // Campo texto com 10 colunas
      textField1 = new JTextField( 10 );    
      add( textField1 ); // adiciona textField1 ao JFrame
      // Campo texto com texto default
      textField2 = new JTextField( "Entre com o texto aqui" );
      add( textField2 ); // adiciona textField2 ao JFrame
      // Campo texto com texto default e 21 colunas    
      textField3 = new JTextField( "Campo Texto nao editavel", 21 );
      textField3.setEditable( false ); // desabilita edicao        
      add( textField3 ); // adiciona textField3 ao JFrame
      // Campo senha com texto default
      passwordField = new JPasswordField( "Texto oculto" );
      add( passwordField ); // adiciona passwordField ao JFrame
      // Manipuladores de eventos
      TextFieldHandler handler = new TextFieldHandler();
      textField1.addActionListener( handler );          
      textField2.addActionListener( handler );          
      textField3.addActionListener( handler );          
      passwordField.addActionListener( handler );       
   }

   private class TextFieldHandler implements ActionListener
   {  // processa eventos do campo texto
      public void actionPerformed( ActionEvent event )
      {  String string = ""; // declara string ao display
         // usuario pressionou Enter no JTextField textField1
         if ( event.getSource() == textField1 )
            string = String.format( "textField1: %s", event.getActionCommand() );
         // usuario pressionou Enter no JTextField textField2
         else  if ( event.getSource() == textField2 )
                  string = String.format( "textField2: %s", event.getActionCommand() );
         // usuario pressionou Enter no JTextField textField3
         else  if ( event.getSource() == textField3 )
                  string = String.format( "textField3: %s", event.getActionCommand() );
         // usuario pressionou Enter no JTextField passwordField
         else  if ( event.getSource() == passwordField )
                  string = String.format(
                              "passwordField: %s", new String( passwordField.getPassword()) 
   				                         );
         // apresenta conteúdo do JTextField
         JOptionPane.showMessageDialog( null, string );
      }
   }
}
