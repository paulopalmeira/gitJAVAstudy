class MeuPrograma6 {
	public static void main(String[] args)	 {
		
	// Estudando WHILE	

	int idade = 10;
	
	while (idade < 18) {
		System.out.println(idade);
		idade = idade + 1;
	}
	
	
	// Estudando FOR ... a sintaxe FOR (iniciali; cond; increm)
	
	for (int i = 0; i < 10; i = i + 1) {
		System.out.println("Mostra " + i);
	}


	// Outro caso de FOR

	for (int i = 1 ; i < 100 ; i++) {
		if (i % 19 == 0) {
			System.out.println("Achei um número divisível por 19 entre x e y. É " + i);
			break;
		}
	} 

		



	}
}