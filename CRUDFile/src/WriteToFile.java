import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("TXTqueVAIserLido.txt");
      myWriter.write("Black Clouds and Silver Linings");
      myWriter.close();
      System.out.println("Escreveu a letra do Dream Theater no TXT.");
    } catch (IOException e) {
      System.out.println("Não foi possível escrever.");
      e.printStackTrace();
    }
  }
}