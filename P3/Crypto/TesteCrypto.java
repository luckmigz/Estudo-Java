package P3.Crypto;



// Classe “TesteCrypto.java”
import java.io.File;
public class TesteCrypto
{  public static void main(String[] args) throws Exception
   {  String   sMsgClara;
      String   sMsgCifrada = null;
      String   sMsgDecifrada = null;
      byte[]   bMsgClara = null;
      byte[]   bMsgCifrada = null;
      byte[]   bMsgDecifrada = null;
      FileEditor ed = new FileEditor();
      ed.readFile();
      sMsgClara = ed.getMsg();
      ed.createFile("texto_cifrada.txt");
      
      // Instancia objeto da classe Impressora
      Impressora prn = new Impressora();
      // Imprime marcador de bloco
      // Converte o texto String dado no equivalente byte[]
      bMsgClara = sMsgClara.getBytes("ISO-8859-1");
      // Imprime cabecalho da mensagem
      ed.writeFile("Mensagem Clara (Hexadecimal):");
      // Imprime o texto original em Hexadecimal
      ed.writeFile(prn.hexBytesToString(bMsgClara));
      
      /*
       * Criptografia Dummy ------------------------------------------------------------
       */
      ed.writeFile("   ");
      ed.writeFile(">>> Cifrando com o algoritmo Dummy...");
      
      // Instancia um objeto da classe CryptoDummy
      CesarCipher cdummy = new CesarCipher();
      // Gera a chave criptografica Dummy simetrica e nome do arquivo onde sera armazenada
   
      // Gera a cifra Dummy da mensagem dada, com a chave Dummy simetrica dada
      cdummy.cifrarCesar(bMsgClara, 10);
      // Recebe o texto cifrado
      bMsgCifrada = cdummy.getTextoCifrado();
      // Converte o texto byte[] no equivalente String
      sMsgCifrada = (new String (bMsgCifrada, "ISO-8859-1"));
      // Imprime cabecalho da mensagem
      ed.writeFile("Mensagem Cifrada (Hexadecimal):");
      // Imprime o texto cifrado em Hexadecimal
      ed.writeFile(prn.hexBytesToString(bMsgCifrada));
      // Gera a decifra Dummy da mensagem dada, segundo a chave Dummy simetrica gerada
      cdummy.decifrarCesar(bMsgCifrada, 10);
      // recebe o texto decifrado
      bMsgDecifrada = cdummy.getTextoDecifrado();
      // Converte o texto byte[] no equivalente String
      sMsgDecifrada = (new String (bMsgDecifrada, "ISO-8859-1"));
      // Imprime cabeÃ§alho da mensagem
      String b = sMsgDecifrada;
      /*
       * Criptografia AES --------------------------------------------------------------
       */
      
      ed.writeFile("");
      ed.writeFile(">>> Cifrando com o algoritmo AES...");
      ed.writeFile("");
      // Instancia um objeto da classe CryptoAES
      CryptoAES   caes = new CryptoAES();
      // Gera a Chave criptografica AES simetrica e o nome do arquivo onde será armazenada
      caes.geraChave(new File ("chave.simetrica"));
      // Gera a cifra AES da mensagem dada, com a chave simetrica dada
      caes.geraCifra(bMsgClara, new File ("chave.simetrica"));
      // Recebe o texto cifrado
      bMsgCifrada = caes.getTextoCifrado();
      // Converte o texto byte[] no equivalente String
      sMsgCifrada = (new String (bMsgCifrada, "ISO-8859-1"));
      // Imprime cabecalho da mensagem
      ed.writeFile("Mensagem Cifrada (Hexadecimal):");
      // Imprime o texto cifrado em Hexadecimal
      ed.writeFile(prn.hexBytesToString(bMsgCifrada));
      ed.writeFile("");
      // Imprime cabecalho da mensagem
      ed.writeFile("Mensagem Cifrada (String):");
      // Imprime o texto cifrado em String
      ed.writeFile(sMsgCifrada);
         // Gera a decifra AES da mensagem dada, segundo a chave simetrica gerada
      caes.geraDecifra(bMsgCifrada, new File ("chave.simetrica"));
      // recebe o texto decifrado
      bMsgDecifrada = caes.getTextoDecifrado();
      // Converte o texto byte[] no equivalente String
      sMsgDecifrada = (new String (bMsgDecifrada, "ISO-8859-1"));
      String a = sMsgDecifrada;
      /*
       * Criptografia RSA --------------------------------------------------------------
       */
      // Imprime Texto
      ed.writeFile(">>> Cifrando com o algoritmo RSA...");
      ed.writeFile("");
      // Instancia um objeto da classe CryptoRSA
      CryptoRSA   crsa = new CryptoRSA();
      // Gera as Chaves criptografica RSA publica e privada e os arquivos onde armazenar
      crsa.geraParDeChaves(new File ("chave.publica"), new File ("chave.privada"));
      // Gera a cifra RSA da mensagem dada, segundo a chave publica gerada
      crsa.geraCifra(bMsgClara, new File ("chave.publica"));
      // Recebe o texto cifrado
      bMsgCifrada = crsa.getTextoCifrado();
      // Converte o texto byte[] no equivalente String
      sMsgCifrada = (new String (bMsgCifrada, "ISO-8859-1"));
      ed.writeFile("Mensagem Cifrada (String):");
      // Imprime o texto cifrado em String
      ed.writeFile(sMsgCifrada);
      // Gera a decifra RSA da mensagem dada, segundo a chave privada gerada
      crsa.geraDecifra(bMsgCifrada, new File ("chave.privada"));
      // recebe o texto decifrado
      bMsgDecifrada = crsa.getTextoDecifrado();
      // Converte o texto byte[] no equivalente String
      sMsgDecifrada = (new String (bMsgDecifrada, "ISO-8859-1"));
      // Imprime cabecalho da mensagem
      ed.closeFile();
      ed.createFile("texto_decifrado.txt");
      ed.writeFile("Msg decifrada com: AES ");
      ed.writeFile(a);
      ed.writeFile("Msg decifrada com: DUMMY ");
      ed.writeFile(b);
      ed.writeFile("Msg decifrada com: RSA ");
      ed.writeFile(sMsgDecifrada);
      ed.closeFile();
   }
}

