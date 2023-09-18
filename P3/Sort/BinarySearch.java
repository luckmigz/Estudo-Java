package P3.Sort;
public class BinarySearch {
    public static void main(String[] args){ 
        int[] actual = { 5, 1, 6, 2, 3, 4 };

        System.out.println("Antes do Sort");
        for (int i: actual) {
            System.err.print(i+" ");
        }
        System.out.println("");
        MergeSort.mergeSort(actual, actual.length);
        System.out.println("Após o Sort");
        for (int i: actual){
            System.err.print(i+" ");
        }
        System.out.println("");
        int a = bSR(actual, 0, actual.length, 3 );
        System.out.println("Elemento encontrado no: "+a);
        bSI(actual,0 ,actual.length ,3 );
    }



    public static int bSR(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return bSR(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return bSR(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }  
    public static void bSI(int arr[], int first, int last, int key){  
        int mid = (first + last)/2;  
        while( first <= last ){  
            if ( arr[mid] < key ){  
                first = mid + 1;     
            }else if ( arr[mid] == key ){  
                System.out.println("Elemento encontrado no: " + mid);  
                break;  
            }else{  
                last = mid - 1;  
            }  
            mid = (first + last)/2;  
        }  
        if ( first > last ){  
        System.out.println("Elemento faltante!");  
        }  
  }  
}
