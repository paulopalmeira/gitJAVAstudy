import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Digite nome, idade e salário: ");

    String nome = myObj.nextLine();
    int idade = myObj.nextInt();
    double salario = myObj.nextDouble();

    System.out.println("Name: " + nome);
    System.out.println("Age: " + idade);
    System.out.println("Salary: " + salario);
    
    try {
        FileWriter VouEscrever = new FileWriter("TXTqueVAIserLido.txt");
        VouEscrever.write(nome + "\n" + idade + "\n"+ salario);
        VouEscrever.close();
        System.out.println("Gravei o que foi digitado");
      } catch (IOException e) {
        System.out.println("Não foi possível gravar.");
        e.printStackTrace();
      }
  }
}
