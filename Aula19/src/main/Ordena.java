package main;


public class Ordena {
    
    public int[] ordenaNumerosDecrescente(int v[]){

        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < i; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        return v;
    }

}
