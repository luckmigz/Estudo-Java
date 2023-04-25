public class Disciplina {
    private String professor, nome;
    private int semestre;
    private boolean oferta;
    public Disciplina(String n, int i, boolean b, String m){
        professor = n;
        semestre = i;
        oferta = b;
        nome = m; 
    }
    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String n){
        professor = n;
    }
    public int getSemetre(){
        return semestre;
    }
    public void setSemetre(int i){
        semestre = i;
    }
    public boolean getOferta(){
        return oferta;
    }
    public void setOferta(boolean b){
        oferta = b;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String m){
        nome = m;
    }
}
