import java.util.Scanner;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int option;
		
		do {
			
		System.out.println("** Menu **");
		System.out.println("0 - Sair");
		System.out.println("1 - Incluir contato");
		System.out.println("2 - Consulta contato");
		System.out.println("3 - Listar todos contatos");
		System.out.println("4 - Excluir contatos");
		
		option = teclado.nextInt();
		
	
			switch(option) {
				case 1: {
					IncluiContato();
					break;
				}
				case 2: {
					ConsultaContato();
					teclado.nextLine();
					teclado.nextLine();
					break;
				}
				case 3: {
					ListadeContatos.listAl();
					teclado.nextLine();
					teclado.nextLine();
					break;
				}
				case 4: {
					ExcluiContato();
					break;
				}
			}
		}while(option != 0);
		
		
	}
	
	private static void IncluiContato() {
		String nome, email, numero;
		System.out.print("Informe o nome do contato: ");
		teclado.nextLine();
		nome = teclado.nextLine();
		System.out.print("Informe o email do contato: ");
		email = teclado.nextLine();
		System.out.print("Informe o numero do contato: ");
		numero = teclado.nextLine();
		ListadeContatos.addAl(nome, email, numero);
	}
	
	private static void ExcluiContato() {
		int opcao;
		System.out.print("Digite o numero do contato a ser excluido: ");
		opcao = teclado.nextInt();
		ListadeContatos.removeAl(opcao);
	}
	
	private static void ConsultaContato() {
		int num;
		System.out.print("Digite o id do contato a ser consultado: ");
		num = teclado.nextInt();
		ListadeContatos.listcontAl(num);
	}
}
