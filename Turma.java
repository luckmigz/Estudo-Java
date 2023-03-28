public class Turma {
   private String nome, curso;
   private int serie,quantAlunos;
   public Turma(String n, int i, int a, String m){
      nome = n;
      curso = m;
      serie = i;
      quantAlunos = a;
      
   } 
   public String getNome(){
      return nome;
   }
   public void setNome(String n){
      nome = n;
   }
   public String getCurso(){
      return curso;
   }
   public void setCurso(String m){
      curso = m;
   }
   public int getSerie(){
      return serie;
   }
   public void setSerie(int i){
      serie = i;
   }
   public int getQuantAlunos(){
      return quantAlunos;
   }
   public void setQuantAlunos(int a){
      quantAlunos = a;
   }
   
}
