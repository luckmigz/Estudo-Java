package hashtable;

public class TestHash {

    public static void main(String[] args) {
       
        int[] tabKeys = new int[100000];

     
        SList[] tabHash = new SList[1000];

 
        public static int hash(int key) {
            return key % 1000;
        }

        for (int i = 1; i < tabKeys.length; i++) {
            int key = tabKeys[i];
            int hash = hash(key);
            tabHash[hash].insertBeginning(key);
        }

        for (int i = 0; i < tabHash.length; i++) {
            System.out.println("Position " + i + ":");
            tabHash[i].prints();
        }
    }
}
