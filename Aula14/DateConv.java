package Aula14;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class DateConv {
    public static void main(String[] args) throws ParseException
   {	Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		DateFormat f = DateFormat.getDateInstance();
		System.out.println("Data: " + f.format(data));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: " + sdf.format(data));

		//Converte Objetos
		System.out.println("Data convertida: " + sdf.parse("02/08/1970"));
	}
}
