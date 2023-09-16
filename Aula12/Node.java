package Aula12;

public class Node {
    int value; 
    Node parent,left,right;

  

    public Node(int key){
        this.value = key;
        this.parent = null;
        this.left = null;
        this.right = null;    
    }
    public int getValue() {
        return value;
    }
    
    public int getParent() {
        return parent.value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }
  

    public void add(Node node){
        if(this.left == null){
            this.left = node;     
        }else if(this.right == null){
                this.right = node;
            }else{
                this.left.add(node);
            
            }
    }
    

}
