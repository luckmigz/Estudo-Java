import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu ano de nascimento");
        int ano = scan.nextInt();
        LocalDateTime datanasc =  LocalDateTime.of(ano, 1, 1, 0, 0, 0);
        LocalDateTime hj = LocalDateTime.now();
        long anos = datanasc.until(hj,ChronoUnit.YEARS);
        System.out.printf("Você tem %d anos",anos);
        scan.close();
    }
}
