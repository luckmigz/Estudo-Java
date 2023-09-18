package P3.Stack;

public class Main {
    public static void main(String[] args){
        Stack x = new Stack(3);
        x.display();
        x.push(9);
        x.push(4);
        x.push(3);
        x.display();
        x.pop();
        x.display();
        x.pop();
        x.display();
        x.pop();
        x.display();
    }
}
