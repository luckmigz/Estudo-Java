
public class TestTree {
    public static void main(String[] args) {
        
        // Declarar Nós
        TreeNode root = new TreeNode(5);
        TreeNode f1 = new TreeNode(4);
        TreeNode f2 = new TreeNode(3);
        TreeNode f3 = new TreeNode(7);
        TreeNode f11 = new TreeNode(1);
        TreeNode f12 = new TreeNode(2);
        TreeNode f21 = new TreeNode(8);
        TreeNode f211 = new TreeNode(21);
        TreeNode f212 = new TreeNode(12);
        TreeNode f31 = new TreeNode(0);
        TreeNode f32 = new TreeNode(6);

        // Fazer relaões de filho
        root.child.add(f1);
        root.child.add(f2);
        root.child.add(f3);
        f1.child.add(f11);
        f1.child.add(f12);
        f2.child.add(f21);
        f21.child.add(f211);
        f21.child.add(f212);
        f3.child.add(f31);
        f3.child.add(f32);
        
        // Relações de pai 
        f211.parent = f21;
        f212.parent = f21;
        f21.parent = f2;
        f2.parent = root;
        f31.parent = f3;
        f32.parent = f3;
        f3.parent = root;
        f11.parent = f1;
        f12.parent = f1;
        f1.parent = root;



        // Testar os métodos
       
        System.out.println("Valores dos filhos da raiz:");
        root.imprimeFilhos();

        
        System.out.println("Valores dos filhos folhas da raiz:");
        root.imprimeFilhosFolhas();

        System.out.println("Percurso Preorder a partir da raiz:");
        root.preorder();

        System.out.println("Percurso Posorder a partir da raiz:");
        root.posorder();

        System.out.printf("Pai do %s:\n", f1.valor );
        TreeNode paiDoFilho1 = f1.parent();
        System.out.println(paiDoFilho1 != null ? paiDoFilho1.valor : "Nenhum pai");

        System.out.printf("Valor do pai do %s:\n", f1.valor);
        f1.imprimePai();

        System.out.printf("O %s é interno? \n%s\n",f1.valor,f1.ehInterno());

        f12.dobraPai();
        System.out.printf("Valor do pai do nó %s após dobrar: \n%s \n", f12.valor, (f12.parent.valor));

        f21.dobraFilhos();
        System.out.printf("Valores dos filhos do nó %s após dobrar:\n",f21.valor);
        for (TreeNode child : f21.child) {
            System.out.println(child.valor);
        }
        
        

    }

}
