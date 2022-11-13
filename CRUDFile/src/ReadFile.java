import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class ReadFile {
  public static void main(String[] args) {
    try {
      File meuObjeto = new File("TXTqueVAIserLido.txt");
      Scanner meuLeitor = new Scanner(meuObjeto);
      while (meuLeitor.hasNextLine()) {
        String data = meuLeitor.nextLine();
        System.out.println(data);
      }
      meuLeitor.close();
    } catch (FileNotFoundException e) {
      System.out.println("Deu um erro.");
      e.printStackTrace();
    }
  }
}