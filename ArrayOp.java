public class ArrayOp {
    public void insertSort(int array[]){
        int n = array.length;
        for(int i = 0; i < n; i++){
            int ind = array[i];
            int j = i - 1;
            while(j > -1 && array[j] > ind ){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = ind;
        }
    }
   
}
