package Client;

public class ViewSys {
    public void displayStatus(String status) {
        System.out.println(status);
    }

    public void displayError(String error) {
        System.err.println("Error: " + error);
    }
}