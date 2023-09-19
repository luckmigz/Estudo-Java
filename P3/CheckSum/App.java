package P3.CheckSum;





public class App {
    public static void main(String[] args) throws Exception {
        Checksum checksum = new Checksum();
        LerArq file = new LerArq("P3", "text.txt");
        String test = file.filereader();  
        String g = checksum.calcularComplemento2(checksum.sumBin(
                checksum.toBinary(test)));
        int i = Integer.parseInt(g,2);
        String b = new Character((char) i ).toString();
        String a =checksum.verify(
            checksum.sumBin(checksum.toBinary(test)), 
            checksum.calcularComplemento2(checksum.sumBin(
                checksum.toBinary(test))));
        System.out.println(a + "Original: " + "\n" + test + "\nComplemento: " + b);
        ChecksumTest tes = new ChecksumTest(test);
        
    }
}
