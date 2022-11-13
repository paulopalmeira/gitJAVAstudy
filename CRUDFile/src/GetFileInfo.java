import java.io.File;

public class GetFileInfo { 
  public static void main(String[] args) {
    File myObj = new File("TXTqueVAIserLido.txt");
    if (myObj.exists()) {
      System.out.println("Nome do arquivo: " + myObj.getName());
      System.out.println("Caminho: " + myObj.getAbsolutePath());
      System.out.println("Gravacao: " + myObj.canWrite());
      System.out.println("Leitura: " + myObj.canRead());
      System.out.println("Tamanho: " + myObj.length() + " bytes");
    } else {
      System.out.println("O arquivo nem existe.");
    }
  }
}