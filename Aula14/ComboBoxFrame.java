package Aula14;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame
{  private JComboBox imagesJComboBox; // combobox para armazenar os nomes dos icones
   private JLabel label; // label para mostrar icone selecionado
   private String names[] = { "bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif" };
   private Icon icons[] =  {  new ImageIcon( getClass().getResource( names[ 0 ] ) ),
                             	new ImageIcon( getClass().getResource( names[ 1 ] ) ),
                             	new ImageIcon( getClass().getResource( names[ 2 ] ) ),
                             	new ImageIcon( getClass().getResource( names[ 3 ] ) )
                           };
   // Construtor do ComboBoxFrame adiciona JComboBox ao JFrame
   public ComboBoxFrame()
   {  super( "Testando JComboBox" );
      setLayout( new FlowLayout() ); // specifica um layout
      imagesJComboBox = new JComboBox( names ); // Programa JComboBox 
      imagesJComboBox.setMaximumRowCount( 3 ); // Mostra 3 linhas
      imagesJComboBox.addItemListener
      (  new ItemListener()
         {  // Manipula o evento da JComboBox
            public void itemStateChanged( ItemEvent event )       
            {  // Determine se check box foi selecionado          
               if ( event.getStateChange() == ItemEvent.SELECTED )
               {  label.setIcon( icons[ imagesJComboBox.getSelectedIndex() ] );
               }
            }  
         }                           
      );                           
      add( imagesJComboBox ); // adiciona o combobox ao JFrame
      label = new JLabel( icons[ 0 ] ); // apresenta o 1o ícone
      add( label ); // adiciona o label ao JFrame
   }
}
