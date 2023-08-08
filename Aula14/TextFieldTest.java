package Aula14;

// Testando TextFieldFrame
import javax.swing.JFrame;

public class TextFieldTest
{  public static void main( String args[] )
   {  TextFieldFrame textFieldFrame = new TextFieldFrame();
      textFieldFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      textFieldFrame.setSize( 325, 125 ); // tamanho do frame (L, H)
      textFieldFrame.setVisible( true ); // apresenta frame
   }
}
