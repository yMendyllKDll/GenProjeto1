package ExecucaoMusicas;

import java.util.Scanner;
import java.util.Random;
import ExecucaoMusicas.FormPlayer;

public class InteracaoUsuario extends Menus {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome, y;
		int genero, artista, aleatorio, resposta = 0, x = 1;
		int generoSamba, generoHm,generoIr,generoIn,generoEle,generoPop;



		System.out.println("Bem vinde ao Gen Music!!");
		System.out.println("Digite seu primeiro nome: ");
		nome = leia.nextLine();

		while (x != 0) {
			resposta = MostraMenu();
			while (resposta != 1 && resposta != 2 && resposta != 3) {
				System.out.println("Digite [1], [2] ou [3] ");
				resposta = leia.nextInt();

			}

			if (resposta == 1) {
				System.out.println("Os generos disponiveis são: ");
				System.out.println("[1]- Samba");
				System.out.println("[2]- Heavy Metal");
				System.out.println("[3]- Indie Rock");
				System.out.println("[4]- Pop");
				System.out.println("[5]- Eletronica");
				System.out.println("[6]- Infantil");
				genero = leia.nextInt();
				
				
			}
			if (resposta == 2) {
				System.out.println("Os artistas disponiveis são: ");
				System.out.println("[1]- Zeca Pagodinho");
				System.out.println("[2]- Iron Maiden");
				System.out.println("[3]- Arctic Monkeys");
				System.out.println("[4]- Sub Urban");
				System.out.println("[5]- David Guetta");
				System.out.println("[6]- Eliana");

			}
			if (resposta == 3) {
				System.out.println("Tocando no aleatorio... ");
				String[] opcoes = { "The Scarecrow - Avantasia", "MGMT - Electric Feel", "The Kid LAROI - STAY",
						"Super Fantástico – A turma do balão mágico", "Alan Walker - Faded",
						"O show tem que continuar - Fundo de quintal" };

				String selecionada1 = opcoes[new Random().nextInt(opcoes.length)];
				System.out.println(selecionada1 + "\n");

			}
			System.out.println("O que você deseja fazer a seguir?");
			System.out.println("[1]Retornar ao menu inicial");
			System.out.println("[0]Sair");
			x = leia.nextInt();

		}
		System.out.println("Fim do programa!!!");
	
	}
}

