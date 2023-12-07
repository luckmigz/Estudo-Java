public class Hash_01 {

  public static void main(String[] args) {

    Aluno[] tabAluno = new Aluno[10];

    tabaluno[6] = new Aluno(10, "Ana");
    tabaluno[1] = new Aluno(21, "Silas");
    tabaluno[2] = new Aluno(22, "Ari");
    tabaluno[3] = new Aluno(24, "Pedro");
    tabaluno[4] = new Aluno(35, "Jonas");
    tabaluno[5] = new Aluno(60, "Saulo");
    tabaluno[6] = new Aluno(44, "Josué");
    tabaluno[7] = new Aluno(57, "Paulo");
    tabaluno[8] = new Aluno(80, "Sara");
    tabaluno[9] = new Aluno(90, "Davi");

    Integer hashCode = null, chave;
    Aluno[] tabHash = new Aluno[10];

    for (int i = 0; i < tabAluno.length; i++) {
      chave = tabAluno[i].getCodAluno();
      hashCode = hash(chave);
      System.out.println("Chave = " + chave + " mapeada para hascode = " + hashCode);

      if (tabHash[hashCode] == null) {
        tabHash[hashCode] = tabAluno[i];
      } else {
        System.out.println("** Colisão no slot da Tabela Hash **");
        System.out.println("Chave " + tabAluno[i].getCodAluno() + " NÃO ARMAZENADA NA TABELA HASH ...");
      }
    }

    System.out.println("\nTabela Aluno:");
    System.out.println("--------------------------");
    for (int i = 0; i < tabAluno.length; i++) {
      System.out.print("Slot " + i + " ---> " + tabAluno[i].getCodAluno() + " " + tabAluno[i].getNome() + "\n");
    }

    System.out.println("\nTabela HASH:");
    System.out.println("--------------------------");
    for (int i = 0; i < tabHash.length; i++) {
      if (tabHash[i] == null) {
        System.out.println("Slot " + i + " ---> Valor nulo");
      } else {
        System.out.print("Slot " + i + " ---> " + tabHash[i].getCodAluno() + " " + tabHash[i].getNome() + "\n");
      }
    }
  }

  public static Integer hash(Integer key) {
    // Função hash mais sofisticada
    return (key * 37 + 11) % 10;
  }
}
