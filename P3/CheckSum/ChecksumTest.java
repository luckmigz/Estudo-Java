package P3.CheckSum;

import java.io.UnsupportedEncodingException;

public class ChecksumTest {
    Checksum test = new Checksum();

    public ChecksumTest(String a) throws UnsupportedEncodingException{
        String g = test.sumBin(a.getBytes("Ascii"));
        String h = test.sumBin(test.toBinary(a));
        if(g.equals(h)){
            System.out.println("sumBin ok");
        }
        String one = test.calcularComplemento2(h);
        String two = test.calcularComplemento2(g);
        if(one.equals(two)){
            System.out.println("calcularComplemento2 ok");
        }
        String j = test.verify(g, two);
        String l = test.verify(h, one);
        if(j.equals(l)){
            System.out.println("verify ok");
        }
    }
}
