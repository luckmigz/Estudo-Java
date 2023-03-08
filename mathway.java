import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.swing.JOptionPane;

/*public class ano{
    int a,b,c,d;
    double y;
    a = 365;
    if ( y%4 == y/4 ){
        a = a+1;
        int v[] = new v[a];
        for (b=0;b<a;b++){
            v[b] = b ; 
        }
    }
    else{ 
        for (b=0;b<a;b++){
            v[b] = b ; 
        }
    }
}*/

public class mathway{
    public static void main(String[] args) {
        LocalDate dataObj = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = dataObj.format(formato);
        String dia, mes ,ano;
        dia = data.substring(0,2);
        mes = data.substring(3, 5);
        ano = data.substring(6, 10);
        int d,m,a;
        d = Integer.parseInt(dia);
        m = Integer.parseInt(mes);
        a = Integer.parseInt(ano);
        System.out.print(a);
        int da,y,mo;
        String day, yeat,month;
        day = JOptionPane.showInputDialog(null,"Insira o dia: ");
        yeat = JOptionPane.showInputDialog(null,"Insira o ano: "); 
        month = JOptionPane.showInputDialog(null,"Insira o mes: ");
        y = Integer.parseInt(yeat); 
        

    }
}

    
    

        
        