package Trees;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    int valor;
    List<Tree> child;
    Tree parent;


    public Tree(int valor) {
        this.valor = valor;
        this.child = new ArrayList<>();
    }

    public int getValor() {
        return valor;
    }
    //retorna o pai do nó
    public Tree parent() {
        return parent;
    }
    // Imprime dados dos filhos do nó
    public void imprimeFilhos() {
        for (Tree child : child) {
            System.out.println(child.valor);
        }
    }
    //imprime o dado armazenado no pai
    public void imprimePai() {
        if (parent != null) {
            System.out.println(parent.valor);
        }
    }
   //Imprime dados dos filhos folhas do nó
    public void imprimeFilhosFolhas() {
        for (Tree child : child) {
            if (child.child.isEmpty()) {
                System.out.println(child.valor);
            }
            else{ 
                System.out.printf("O Nó %s não tem filhos folha  \n", valor);
                break;
            }
        }
    }
    //retorna nodes em ordem preorder
    public void preorder() {
        System.out.println(valor);
        for (Tree child : child) {
            child.preorder();
        }
    }
    // retorna nodes em ordem postorder
    public void posorder() {
        for (Tree child : child) {
            child.posorder();
        }
        System.out.println(valor);
    }
    // retorna o node root da árvore
    public Tree ret_Root() {
        return parent == null ? this : parent.ret_Root();
    }
// Retorna no filho
    public List<Tree> children() {
        return child;
    }
// retorna se é interno
    public boolean isInternal() {
        return !child.isEmpty();
    }
// retorna se é externo
    public boolean isExternal() {
        return child.isEmpty();
    }
// retorna o número de nodes na árvore
    public int size() {
        int count = 1; // Inclui o nó atual
        for (Tree filho : child) {
            count += filho.size();
        }
        return count;
    }
// testa se a árvore é vazia
    public boolean isEmpty() {
        return this == null;
    }
// retorna o número de ancestrais do node
    public int depth() {
        if (parent == null) {
            return 0;
        } else {
            return 1 + parent.depth();
        }
    }
// retorna a altura do node
    public int height() {
        int height = -1;
        for (Tree filho : child) {
            int childHeight = filho.height();
            if (childHeight > height) {
                height = childHeight;
            }
        }
        return height + 1;
    }
// altera o dado em um determinado node
    public void replace(int v, int e) {
        if (valor == v) {
            valor = e;
        }
        for (Tree filho : child) {
            filho.replace(v, e);
        }
    }
    public void dobraFilhos() {
        for (Tree child : child) {
            child.dobraNos();
        }
    }
    private void dobraNos() {
        this.valor *= 2;
        for (Tree child : child) {
            child.dobraNos();
        }
    }
    public void dobraPai() {
        if (parent != null) {
            parent.valor *= 2;
        }
    }
}
