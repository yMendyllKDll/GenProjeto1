package org.generation.brazil;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InteracaoUsuario extends Menus {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome, y;
		int genero, artista, aleatorio, resposta = 0, x = 1;
		int generoSamba, generoHm, generoIr, generoIn, generoEle, generoPop;

		FormPlayer reproducao = new FormPlayer();
		Login entradaUsuario = new Login();

		System.out.println("Bem vinde ao Gen Music!!");
		System.out.println("Digite seu primeiro nome: ");
		nome = leia.nextLine();

		while (x != 0) {

			resposta = MostraMenu();
			try {
				while (resposta != 1 && resposta != 2 && resposta != 3) {
					System.out.println("Digite [1], [2] ou [3] ");
					resposta = leia.nextInt();

				}

				if (resposta == 1) {
					resposta = MostraMenu2();
				}

				if (resposta == 1) {
					List<String> musicas = new ArrayList<>(); // sempre voltado a interface
					musicas.add("Tá escrito -  Xande de pilares");
					musicas.add("Verdade - Zeca Pagodinho");
					musicas.add("O meu lugar - Arlindo Cruz");
					musicas.add("Espelho - João Nogueira");
					musicas.add("Vestido Azul – Floribella");
					musicas.add("Deixa a vida me levar - Zeca Pagodinho");

					Collections.sort(musicas);
					System.out.println("Tocando...");
					System.out.println(musicas.get(1));
					System.out.println("\nPróximas Músicas:\n");
					System.out.println(musicas.get(2));
					System.out.println(musicas.get(3));
					System.out.println("\n");
					resposta = Voltar();
				}
				if (resposta == 2) {
					List<String> musicas = new ArrayList<>(); // sempre voltado a interface
					musicas.add("The Clansman - Iron Maiden");
					musicas.add("Senjutsu - Iron Maiden");
					musicas.add("The Scarecrow - Avantasia");
					musicas.add("Wuthering Heights - Angra");
					musicas.add("A Tale That Wasn’t Right - Helloween");
					musicas.add("Panic Attack - Dream Theater");

					Collections.sort(musicas);
					System.out.println("Tocando...");
					System.out.println(musicas.get(1));
					System.out.println("\nPróximas Músicas:\n");
					System.out.println(musicas.get(2));
					System.out.println(musicas.get(3));
					System.out.println("\n");
					resposta = Voltar();
				}
				if (resposta == 3) {
					List<String> musicas = new ArrayList<>(); // sempre voltado a interface
					musicas.add("MGMT - Electric Feel");
					musicas.add("Arctic Monkeys - When The Sun Goes Down");
					musicas.add("Arctic Monkeys - Arabela");
					musicas.add("The Kooks - Bad Habit");
					musicas.add("The Black Keys - Lonely Boy");
					musicas.add("Foster The People - Helena Beat");

					Collections.sort(musicas);
					System.out.println("Tocando...");
					System.out.println(musicas.get(1));
					System.out.println("\nPróximas Músicas:\n");
					System.out.println(musicas.get(2));
					System.out.println(musicas.get(3));
					System.out.println("\n");
					resposta = Voltar();
				}

				if (resposta == 4) {
					List<String> musicas = new ArrayList<>(); // sempre voltado a interface
					musicas.add("The Kid LAROI - STAY");
					musicas.add("Sub Urban - Cradles");
					musicas.add("Rihanna - Stay");
					musicas.add("Lil Nas X - MONTERO");
					musicas.add("Sub Urban - Freak");
					musicas.add("Lady Gaga - Alejandro");

					Collections.sort(musicas);
					System.out.println("Tocando...");
					System.out.println(musicas.get(1));
					System.out.println("\nPróximas Músicas:\n");
					System.out.println(musicas.get(2));
					System.out.println(musicas.get(3));
					System.out.println("\n");
					resposta = Voltar();
				}
				if (resposta == 5) {
					List<String> musicas = new ArrayList<>(); // sempre voltado a interface
					musicas.add("Love Tonight - David Guetta");
					musicas.add("Pressure -  Martin Garrix e Tove lo");
					musicas.add("Alive and Feeling Fine - The Suncatchers");
					musicas.add("Faded - Alan Walker");
					musicas.add("Lean On - Major Lazer, MŲ, DJ Snake");
					musicas.add("Titanium- David Guetta");

					Collections.sort(musicas);
					System.out.println("Tocando...");
					System.out.println(musicas.get(1));
					System.out.println("\nPróximas Músicas:\n");
					System.out.println(musicas.get(2));
					System.out.println(musicas.get(3));
					System.out.println("\n");
					resposta = Voltar();
				}
				if (resposta == 6) {
					List<String> musicas = new ArrayList<>(); // sempre voltado a interface
					musicas.add("A Galinha magricela – Eliana");
					musicas.add("Dedinhos - Eliana");
					musicas.add("Livre Estou – Taryn Szpilman");
					musicas.add("O patinho colorido – Bento e Totó");
					musicas.add("Vestido Azul – Floribella");
					musicas.add("Uni Duni Tê – Trem da Alegria");

					Collections.sort(musicas);
					System.out.println("Tocando...");
					System.out.println(musicas.get(1));
					System.out.println("\nPróximas Músicas:\n");
					System.out.println(musicas.get(2));
					System.out.println(musicas.get(3));
					System.out.println("\n");
					resposta = Voltar();
				}

				if (resposta == 2) {
					resposta = MostraMenu3();
				}
					if (resposta == 1) {
						List<String> artista1 = new ArrayList<>(); // sempre voltado a interface
						artista1.add("Fundo de quintal");
						artista1.add("Xande de pilares");
						artista1.add("Zeca Pagodinho");
						artista1.add("Arlindo");
						artista1.add("João Nogueira");
						artista1.add("Zeca Pagodinho");

						Collections.sort(artista1);
						System.out.println("Tocando...");
						System.out.println(artista1.get(1));
						System.out.println("\nPróximas Músicas:\n");
						System.out.println(artista1.get(2));
						System.out.println(artista1.get(3));
						System.out.println("\n");
						resposta = Voltar();
					}

					if (resposta == 2) {
						List<String> artista1 = new ArrayList<>(); // sempre voltado a interface
						artista1.add("Avantasia");
						artista1.add("The Clansman - Iron Maiden");
						artista1.add("Iron Maiden");
						artista1.add("Angra");
						artista1.add("Helloween");

						Collections.sort(artista1);
						System.out.println("Tocando...");
						System.out.println(artista1.get(1));
						System.out.println("\nPróximas Músicas:\n");
						System.out.println(artista1.get(2));
						System.out.println(artista1.get(3));
						System.out.println("\n");
						resposta = Voltar();
					}

					if (resposta == 3) {
						List<String> artista1 = new ArrayList<>(); // sempre voltado a interface
						artista1.add("MGMT");
						artista1.add("Arctic Monkeys");
						artista1.add("Arctic Monkeys");
						artista1.add("The Kooks");
						artista1.add("The Black Keys");
						artista1.add("Foster The People");

						Collections.sort(artista1);
						System.out.println("Tocando...");
						System.out.println(artista1.get(1));
						System.out.println("\nPróximas Músicas:\n");
						System.out.println(artista1.get(2));
						System.out.println(artista1.get(3));
						System.out.println("\n");
						resposta = Voltar();
					}

					if (resposta == 4) {
						List<String> artista1 = new ArrayList<>(); // sempre voltado a interface
						artista1.add("The Kid LAROI");
						artista1.add("Sub Urban");
						artista1.add("Rihanna");
						artista1.add("Lil Nas X");
						artista1.add("Sub Urban");

						Collections.sort(artista1);
						System.out.println("Tocando...");
						System.out.println(artista1.get(1));
						System.out.println("\nPróximas Músicas:\n");
						System.out.println(artista1.get(2));
						System.out.println(artista1.get(3));
						System.out.println("\n");
						resposta = Voltar();
					}
					if (resposta == 5) {
						List<String> artista1 = new ArrayList<>(); // sempre voltado a interface
						artista1.add("David Guetta");
						artista1.add("Martin Garrix e Tove lo");
						artista1.add("The Suncatchers");
						artista1.add("Alan Walker");
						artista1.add("Major Lazer, MØ, DJ Snake");
						artista1.add("David Guetta");

						Collections.sort(artista1);
						System.out.println("Tocando...");
						System.out.println(artista1.get(1));
						System.out.println("\nPróximas Músicas:\n");
						System.out.println(artista1.get(2));
						System.out.println(artista1.get(3));
						System.out.println("\n");
						resposta = Voltar();
					}

					if (resposta == 6) {
						List<String> artista1 = new ArrayList<>(); // sempre voltado a interface
						artista1.add("A turma do balão mágico");
						artista1.add("Eliana");
						artista1.add("Taryn Szpilman");
						artista1.add("Bento e Totó");
						artista1.add("Floribella");
						artista1.add("Trem da Alegria");

						Collections.sort(artista1);
						System.out.println("Tocando...");
						System.out.println(artista1.get(1));
						System.out.println("\nPróximas Músicas:\n");
						System.out.println(artista1.get(2));
						System.out.println(artista1.get(3));
						System.out.println("\n");
						resposta = Voltar();
					}
			
					
					
					if (resposta == 3)
					{
						System.out.println("Tocando no aleatorio... \n");
						String[] opcoes = { "The Scarecrow - Avantasia", "MGMT - Electric Feel", "The Kid LAROI - STAY",
								"Super Fantástico – A turma do balão mágico", "Alan Walker - Faded",
								"O show tem que continuar - Fundo de quintal" };

						String selecionada1 = opcoes[new Random().nextInt(opcoes.length)];
						System.out.println(selecionada1 + "\n");

						reproducao.iniciar();
						reproducao.play();
						reproducao.pause();
						reproducao.upVolume();
						reproducao.downVolume();
						reproducao.proximaMusica();
						reproducao.musicaAnterior();
						reproducao.finalizarServico();
					}
				
				Voltar();
			} catch (ArithmeticException erro) {
				System.out.println("Só pode digitar valores inteiros ! " + erro);
			}
		}
		System.out.println("Fim do programa!!!");

	}
}
