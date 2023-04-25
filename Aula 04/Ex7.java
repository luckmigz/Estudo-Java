import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Qual é o seu sexo? ");
        String sexo = scanner.nextLine();
        System.out.println("Qual é a sua idade? ");
        int idade = scanner.nextInt();
        if(sexo.equals("Fem")){
            if(idade < 25 ){
                System.out.println(nome + " está aceita");
            }
            else{
                System.out.println(nome + " não está aceita");
            }
        } else{ 
            System.out.println(nome + " não está aceita");
        }
        
        scanner.close();
    }
    
}
