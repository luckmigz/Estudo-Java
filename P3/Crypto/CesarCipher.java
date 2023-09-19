package P3.Crypto;




public class CesarCipher {
    private byte[] textoCifrado;
    private byte[] textoDecifrado;
    
    public CesarCipher() {
        textoCifrado = null;
        textoDecifrado = null;
    }
    
    public void cifrarCesar(byte[] texto, int chave) {
        textoCifrado = new byte[texto.length];
        
        for (int i = 0; i < texto.length; i++) {
            textoCifrado[i] = (byte) (texto[i] + chave);
        }
    }
    
    public byte[] getTextoCifrado() {
        return textoCifrado;
    }
    
    public void decifrarCesar(byte[] texto, int chave) {
        textoDecifrado = new byte[texto.length];
        
        for (int i = 0; i < texto.length; i++) {
            textoDecifrado[i] = (byte) (texto[i] - chave);
        }
    }
    
    public byte[] getTextoDecifrado() {
        return textoDecifrado;
    }
}
