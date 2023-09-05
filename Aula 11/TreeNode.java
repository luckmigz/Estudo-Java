import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int valor;
    List<TreeNode> child;
    TreeNode parent;


    public TreeNode(int valor) {
        this.valor = valor;
        this.child = new ArrayList<>();
    }

    public int getValor() {
        return valor;
    }

    public TreeNode parent() {
        return parent;
    }

    public void imprimeFilhos() {
        for (TreeNode child : child) {
            System.out.println(child.valor);
        }
    }
    public void imprimePai() {
        if (parent != null) {
            System.out.println(parent.valor);
        }
    }
    public boolean ehInterno() {
        return !child.isEmpty();
    }
    public void imprimeFilhosFolhas() {
        for (TreeNode child : child) {
            if (child.child.isEmpty()) {
                System.out.println(child.valor);
            }
            else{ 
                System.out.printf("O Nó %s não tem filhos folha  \n", valor);
                break;
            }
        }
    }
    public void preorder() {
        System.out.println(valor);
        for (TreeNode child : child) {
            child.preorder();
        }
    }
    public void posorder() {
        for (TreeNode child : child) {
            child.posorder();
        }
        System.out.println(valor);
    }
    public void dobraFilhos() {
        for (TreeNode child : child) {
            child.dobraNos();
        }
    }

    private void dobraNos() {
        this.valor *= 2;
        for (TreeNode child : child) {
            child.dobraNos();
        }
    }
    public void dobraPai() {
        if (parent != null) {
            parent.valor *= 2;
        }
    }
}
