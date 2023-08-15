public final class User {
    private String sUser;
    private String sPass; 

    public User(String sU, String sP){
        sUser = sU; 
        sPass = sP;
    }

    public String getUser() {
        return sUser;
    }
    public void setsUser(String sU) {
        sUser = sU;
    }
    
    public String getsPass() {
        return sPass;
    }
    public void setsPass(String sP) {
        sPass = sP;
    }
    public void clearObject() {
        sUser = "Usuario não cadastrado";
        sPass = "Senha não cadastrado";
    }
    
}
