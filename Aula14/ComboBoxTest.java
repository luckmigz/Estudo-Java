package Aula14;

// Testando a ComboBoxFrame.
import javax.swing.JFrame;
public class ComboBoxTest{  
   public static void main( String args[] )
   {  ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
      comboBoxFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      comboBoxFrame.setSize( 350, 150 ); // configura o tamanho do frame
      comboBoxFrame.setVisible( true ); // apresenta o frame
   }
}
