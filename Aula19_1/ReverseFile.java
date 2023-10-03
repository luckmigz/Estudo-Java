package Aula19_1;

import java.io.File;
import java.io.UnsupportedEncodingException;

public class ReverseFile {
    public static void main(String[] args) throws UnsupportedEncodingException {

        Arq arq = new Arq();
        Checksum checksum = new Checksum();

        arq.read("Aula20", "entrada.txt");
        String a = arq.getMsgS();
        String h = a.toString();
        String g = checksum.calcularComplemento2(checksum.sumBin(
                checksum.toBinary(h)));
                int i = Integer.parseInt(g,2);
                String j = new Character((char) i ).toString();
        String b = reverseString(a +" ");
        String c =  checksum.calcularComplemento2(checksum.sumBin(
                checksum.toBinary(b)));
                int k = Integer.parseInt(c,2);
                String l = new Character((char) k ).toString();
        arq.create("saida.txt");
        arq.write(j + "\n" +b + "\n" + l,  new File("Aula20","saida.txt"));
      
        
        arq.close();
    }
    

    

    private static  String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
