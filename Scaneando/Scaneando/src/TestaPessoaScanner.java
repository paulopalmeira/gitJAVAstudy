import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaPessoaScanner {

	public static void main(String[] args) {
		
		dadosPessoas();
	}

	public static void dadosPessoas() {
		Scanner quemtala = new Scanner (system.in);
		Pessoa pessoa;
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		int opcao=0;
		
		do {
			
			System.out.println("# Escolha uma das opcoes abaixo #");
			System.out.println("Opcao 1 - Cadastra pessoa");
			System.out.println("Opcao 2 - Mostra pessoas cadastradas");
			System.out.println("Opcao 0 - Sair");
			System.out.println("_________________________________");
			
			System.out.println("Digite aqui sua opção: ");
			opcao = Integer.parseInt(quemtala.nextLine());
			
			if(opcao == 1) {
				// cria um novo objeto
				pessoa = new Pessoa();
				
				System.out.print("Digite o codigo: ");
		          pessoa.setCodigo(Integer.parseInt(quemtala.nextLine()));

		          System.out.print("Digite o nome: ");
		          pessoa.setNome(quemtala.nextLine());

		          System.out.print("Digite o endereco: ");
		          pessoa.setEndereco(quemtala.nextLine());

		          System.out.print("Digite a idade: ");
		          pessoa.setIdade(Integer.parseInt(quemtala.nextLine()));

		          System.out.println();

		      //Guarda o objeto pessoa em uma lista.
		          listaPessoas.add(pessoa);
		          }else if(opcao == 2){
		            if(listaPessoas.isEmpty()){
		              System.out.println("Nao existem pessoas cadastradas, pressione uma tecla para continuar!");
		              quemtala.nextLine();
		            }else{
		              System.out.println(listaPessoas.toString());

		              System.out.println("Pressione um tecla para continuar.");
		              quemtala.nextLine();
		            }         }
		    } while (opcao != 0);

		    quemtala.close();
		  }
		}