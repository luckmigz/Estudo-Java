package P3.Stack;

public class Stack {
    int[] stack;
    int top; 

    public Stack(int n){
        stack = new int[n];
        top = -1; 
    }

    public void push(int index){
        if(top >= (stack.length - 1)){
            System.out.println("Stack Overflow! Erro no push...!");
        }else{
            top = top + 1;
            stack[top] = index;
        }
    }
    public int pop(){
        if(top <= -1){
            System.out.println("Stack empty! Erro no pop...!");
            return -1;
        }else{
            top = top - 1;
            return stack[top+1];
        }
    }
    public void display(){
        System.out.println("Pilha: ");
        int t = top; 
        if(t <= -1){
            System.out.println("Vazia!");
        }else{
            while(t >= 0){
                System.out.println(" "+stack[t]);
                t= t-1;
            }
        }
        System.out.println(" ");
    }

}
