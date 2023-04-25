import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Em que ano vc nasceu?");
        int ano = scanner.nextInt();
        System.out.println("Em que mes vc nasceu?");
        int mes = scanner.nextInt();
        System.out.println("Em que dia vc nasceu?");
        int dia = scanner.nextInt();
        LocalDateTime datanasc =  LocalDateTime.of(ano, mes, dia, 0, 0, 0);
        LocalDateTime hoje = LocalDateTime.now();
        long dias = datanasc.until(hoje,ChronoUnit.DAYS);
        long meses = datanasc.until(hoje,ChronoUnit.MONTHS);
        long anos = datanasc.until(hoje,ChronoUnit.YEARS);
        String datad = dia + "/" + mes + "/" + ano;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = hoje.format(formato);
        System.out.println("A data de nascimento: "+ datad );
        System.out.println("A data de hoje: "+ data );
        System.out.println("Sua idade em dias: " + dias);
        System.out.println("Sua idade em meses: " + meses); 
        System.out.println("Sua idade em anos: " + anos);

        

    }
}

