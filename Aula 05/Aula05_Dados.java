public class Aula05_Dados {
    public static void main(String[] args){
        int [] v = {1,4,5,6,8,2,3,7,9,0};
        for(int a:v){
            System.out.print(a + " ");
        }
        System.out.println("");
        ArrayOp arr = new ArrayOp();
        arr.insertSort(v);
        for(int a:v){
            System.out.print(a + " ");
        }
      
    }
}
