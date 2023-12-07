package hashtable;

public class TestHash {

    public static void main(String[] args) {
       
        int[] tabKeys = new int[20];

     
        SList[] tabHash = new SList[10];

 
        public static int hash(int key) {
            return key % 10;
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
