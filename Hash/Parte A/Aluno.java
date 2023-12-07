public class Aluno {

  private Integer codAluno;
  private String nome;

  public Aluno() {}

  public Aluno(Integer codAluno, String nome) {
    this.codAluno = codAluno;
    this.nome = nome;
  }

  public Integer getCodAluno() {
    return codAluno;
  }

  public void setCodAluno(Integer codAluno) {
    this.codAluno = codAluno;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Aluno{" +
        "codAluno=" + codAluno +
        ", nome='" + nome + '\'' +
        '}';
  }
}


/*
 * Respostas das questões 2 à 5: 
 * 
 * 2) 
 * A saída quando excuta: 
    Chave = 10 mapeada para hascode = 0
    Chave = 21 mapeada para hascode = 1
    Chave = 22 mapeada para hascode = 2
    Chave = 24 mapeada para hascode = 3
    Chave = 35 mapeada para hascode = 4
    Chave = 60 mapeada para hascode = 5
    Chave = 44 mapeada para hascode = 4
    Chave = 57 mapeada para hascode = 7
    Chave = 80 mapeada para hascode = 8
    Chave = 90 mapeada para hascode = 9
    Tabela Aluno:
    --------------------------
    Slot 0 ---> 10 Ana
    Slot 1 ---> 21 Silas
    Slot 2 ---> 22 Ari
    Slot 3 ---> 24 Pedro
    Slot 4 ---> 35 Jonas
    Slot 5 ---> 60 Saulo
    Slot 6 ---> 44 Josué
    Slot 7 ---> 57 Paulo
    Slot 8 ---> 80 Sara
    Slot 9 ---> 90 Davi
    Tabela HASH:
    --------------------------
    Slot 0 ---> 10 Ana
    Slot 1 ---> 21 Silas
    Slot 2 ---> 22 Ari
    Slot 3 ---> 24 Pedro
    Slot 4 ---> 35 Jonas
    Slot 5 ---> 60 Saulo
    Slot 6 ---> **Colisão no slot da Tabela Hash **
    Chave 44 Josué NÃO ARMAZENADA NA TABELA HASH ...
    Slot 7 ---> 57 Paulo
    Slot 8 ---> 80 Sara
    Slot 9 --->
 *
 * 
 * 3) 
 *  Sim, ocorre 2 colisões. Na chave 44 foi para o slot que a chave 60 ocupava e a chave 90 para o slot que estava a chave 44;
 *  As colisões ocorreram pois a função hash utiizada não considera a distribuição das chaves, nesse caso chaves distintas podem ir para o mesmo slot e causam uma colisão;
 * 
 * 4) 
 *  As colisões podem ser tratadas utilizando um método de encadeamento simples, confome a tabela hash é concluida. Assim no caso de uma colisão, ambas as chaves são armazenadas numa lista ligada no slot;
 * 
 * 5) 
 *  Utilizar métodos de busca, como a busca binaria, antes de adicionar uma chave em um slot;
 * 
 */