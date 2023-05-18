import Aula07.Sort;

public class Main {
    public static void main(String[] args){
        int[] a = {1,3,99,32,1990,2001,00001,1000};
        System.out.println("Antes do Sort");
        for (int i: a){
            System.err.print(i+" ");
        }
        System.out.println("");
        Sort sort = new Sort();
        sort.selectionSort(a);
        System.out.println("Após o Sort");
        for (int i: a){
            System.err.print(i+" ");
        }
    }
}
