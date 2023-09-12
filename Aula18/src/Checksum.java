import java.io.UnsupportedEncodingException;

public class Checksum{

    public byte [] toBinary(String s) throws UnsupportedEncodingException{
        byte[] v = s.getBytes("ASCII");
        return v;

    }
    public String sumBin(byte[] v){
       int a = 0;
        for(int i=0; i<v.length; i++){
            a = a + v[i];
        }
        String s = Integer.toBinaryString(a);
        return s;
    }
    public String calcularComplemento2(String s){
        String one = "", two = ""; 
        
        for(int i=0; i<s.length(); i++){
            one += flip(s.charAt(i));

        }
        int num0 = Integer.parseInt(one, 2);
        StringBuilder builder = new StringBuilder(one);
        boolean bool = false;
        for (int i = one.length() - 1 ;i > 0; i--){
            if(one.charAt(i) == '1'){
                builder.setCharAt(i, '0');
            }else{
                builder.setCharAt(i, '1');
                bool = true;
                break;
            }
        }
        if(!bool){
            builder.append("1",0,7);

        }
        two = builder.toString();
        return two;
    }
    private char flip(char c){
        return (c == '0') ? '1' :'0';
    }

    public String verify(String s, String bin){
        int bin2 = Integer.parseInt(s,2);
        int by = Integer.parseInt(bin,2);
        int res = by + bin2; 
        String a = new Character((char) bin2).toString();
        String b = new Character((char) by).toString();
        String c = "";

        String g = Integer.toBinaryString(res); 
        if(g.substring(1, 9).equals("00000000")){
            c = "Verificada e correta" + " " + a + " " + b + "\n";
           
        }
        c += g.substring(1, 9) +"\n";    
        return c; 

    }


}
