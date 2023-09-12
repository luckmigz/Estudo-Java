package test;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import main.Checksum;
import main.LerArq;

public class TestCheckum {
    Checksum check = new Checksum();
    LerArq file = new LerArq("C:\\Users\\Lucas\\Desktop\\estudoJava\\Aula19\\src\\main\\text.txt");



    @Test
    @DisplayName("Retangulo")

    public void testToBinary(){
        String a = "teste";
        String esperado = "[B@16c0663d";
        try {
            byte[] v = check.toBinary(a);
            byte[] v2 = check.toBinary(a);
            String teste = v.toString();
            
            assertEquals(esperado,teste);


        } catch (UnsupportedEncodingException e) {
            
            e.printStackTrace();
        }
    }
    public void testSumBin(){
        String a = "test1";
        try {
            byte[] bytes = check.toBinary(a);
            String one = check.sumBin(bytes); 
            int b= 0;

            for(int i=0; i<bytes.length; i++){
                b = b + bytes[i];
            }
            String s = Integer.toBinaryString(b);
            assertEquals(one, s);

        } catch (UnsupportedEncodingException e) {
        
            e.printStackTrace();
        }
    }
    public void testComplemento2(){
        String esperado = "000001111";
        String teste = "111110001";
        check.calcularComplemento2(teste);
        assertEquals(esperado, teste);
    }
    public void testFileReader(){
        String esperado = "The Death of the Peace of Mind";
        String teste = file.filereader();
        assertEquals(esperado, teste);
    }
}
