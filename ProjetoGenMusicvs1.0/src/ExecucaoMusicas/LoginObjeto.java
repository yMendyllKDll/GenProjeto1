package ExecucaoMusicas;

import java.util.Scanner;

public class LoginObjeto {


	public static void main(String[] args) {
		

		Scanner ler = new Scanner(System.in);
		
		
        System.out.println("Voc� j� tem um cadastro?");
		System.out.println("Digite |1| para sim e |2| para n�o: ");
		int cadastro  = ler.nextInt();
		System.out.println();

		if (cadastro == 1) {
			System.out.println("Digite o Login: ");
			String login = ler.next();
			System.out.println("Digite sua senha: ");
			int senha = ler.nextInt();
			System.out.println("Voc� est� dentro da biblioteca.");
		}
		
		else {
			System.out.println("Cadastro de usuario");
			System.out.println("Digite os dados:\n"+"Nome: ");
	        String nome = ler.next();
	        System.out.println("Login (e-mail): ");
	        String login = ler.next();
	        System.out.println("Data de nascimento ");
	        int dataNascimento= ler.nextInt();
	        System.out.println("Senha de acesso");
	        int senha = ler.nextInt();
	        
	        System.out.println("Cadastro finalizado: ");
	        System.out.println("Seja bem vindo" + nome);
	        
		}
        
	}
	
}