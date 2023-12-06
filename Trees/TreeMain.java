package Trees;


public class TreeMain {
    public static void main(String[] args) {
        
        // Declarar Nós
        Tree root = new Tree(5);
        Tree f1 = new Tree(4);
        Tree f2 = new Tree(3);
        Tree f3 = new Tree(7);
        Tree f11 = new Tree(1);
        Tree f12 = new Tree(2);
        Tree f21 = new Tree(8);
        Tree f211 = new Tree(21);
        Tree f212 = new Tree(12);
        Tree f31 = new Tree(0);
        Tree f32 = new Tree(6);

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
        Tree paiDoFilho1 = f1.parent();
        System.out.println(paiDoFilho1 != null ? paiDoFilho1.valor : "Nenhum pai");

        System.out.printf("Valor do pai do %s:\n", f1.valor);
        f1.imprimePai();

        System.out.printf("O %s é interno? \n%s\n",f1.valor,f1.isInternal());

        f12.dobraPai();
        System.out.printf("Valor do pai do nó %s após dobrar: \n%s \n", f12.valor, (f12.parent.valor));

        f21.dobraFilhos();
        System.out.printf("Valores dos filhos do nó %s após dobrar:\n",f21.valor);
        for (Tree child : f21.child) {
            System.out.println(child.valor);
        }

    }
}
/*Uma árvore T é um conjunto de nós que armazenam elementos em relacionamentos pai-filho
com as seguintes propriedades:
- Se T não é vazia, ela tem um nó especial chamado raiz de T, que não tem pai.
- Cada nó v de T diferente da raiz tem um único nó pai w;
Uma árvore pode não ter nós. Quando isso ocorre, dizemos que a árvore T é vazia.
Assim, uma árvore T ou é vazia ou consiste de um nó raiz r e um conjunto (possivelmente
vazio) de árvores cujas raízes são filhas de r.*/
/*Dois nós que são filhos do mesmo pai são irmãos.
Um nó v é externo se não tem filhos.
Nós externos também são conhecidos por folhas.
Um nó v é interno se tem um ou mais filhos. */
/* Raiz (root): Nó sem pai (A)
Nó interno: Nó com pelo menos um
filho (A,B,C,F)
Nó externo ou nó folha: nó sem
filhos (D,E,G,H,I,J,K)
Ancestral de um nó: pai, avô,
bisavô, ...
Descendente de um nó: filho, neto,
bisneto, ...
Sub-Árvore: árvore formada por
um nó e seus descendentes.
Aresta: é um par de nós (u,v) tal
que u é pai de v. (A,B)
Caminho: é uma sequência de nós
tais que quaisquer dois nós
consecutivos da sequência sejam
arestas. ( (A,C),(C,G) )
Tamanho de um caminho: # de
arestas em um caminho. ( Tamanho
do caminho ( ( A,C),(C,G) ) = 2 )
Profundidade de um nó n: é Tamanho do
caminho da raiz até o nó n.
(Dept (K) = 3)
Profundidade da raiz: ZERO
Altura de um nó: Tamanho do caminho de n
até o nó de nível mais baixo. (Altura(B) = 4) .
Altura de qualquer folha: ZERO
Altura da Árvore = Altura da Raiz*/