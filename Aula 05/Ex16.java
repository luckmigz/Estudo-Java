public class Ex16 {
    public static void main(String[] args) {
        int pol = 20;
        double cm = 2.54 ; 
        String table = pol + " | " + cm;
        System.out.println("Pol | cm"); 
        for(int i = 1; i <= pol; i++){
            cm = i*2.54;
            table = i +" | " + cm ; 
            System.out.println(table);
        }   

    }
}
