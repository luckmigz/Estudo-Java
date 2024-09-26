package DoubleLinked;



import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        int choice;

        do {
            System.out.println("Digite 1 para inserir um número ou 0 para sair:");
            choice = scanner.nextInt();
            if (choice == 1) {
                int randomNumber = rand.nextInt(100) + 1;
                System.out.println("Número gerado: " + randomNumber);
                list.insert(randomNumber);
            }
        } while (choice != 0);


        scanner.close();
    }
}
