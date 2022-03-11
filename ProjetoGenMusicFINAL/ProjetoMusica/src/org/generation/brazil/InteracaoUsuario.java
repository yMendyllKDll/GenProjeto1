package org.generation.brazil;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.InputMismatchException;

public class InteracaoUsuario extends Menus {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int genero, artista, resposta = 0, x = 1;

		FormPlayer reproducao = new FormPlayer();

		System.out.println("Seja bem vinde ao GenPlay Music! Aproveite a melhor biblioteca musical desse bootcamp.\n");
		System.out.println("Como você quer ser chamade?: ");
		nome = leia.nextLine();

		while (x != 0) {
			try {
				resposta = MostraMenu();

				while (resposta != 1 && resposta != 2 && resposta != 3) {
					System.out.println("Digite [1], [2] ou [3] ");
					resposta = leia.nextInt();

				}

				if (resposta == 1) {
					genero = MostraMenu2();
					if (genero == 1) {
						List<String> artista1 = new ArrayList<>(); // sempre voltado a interface
						artista1.add("O show tem que continuar - Fundo de quintal");
						artista1.add("Tá escrito - Xande de pilares");
						artista1.add("Verdade - Zeca Pagodinho");
						artista1.add("O meu lugar - Arlindo");
						artista1.add("Espelho - João Nogueira");
						artista1.add("Deixa a vida me levar - Zeca Pagodinho");

						Collections.sort(artista1);
						System.out.println("Reproduzindo....\n");
						System.out.println(artista1.get(1));
						reproducao.iniciar();
						System.out.println("\nPróximas faixas:\n");
						System.out.println(artista1.get(2));
						System.out.println(artista1.get(3));
						System.out.println("\n");
						x = Voltar();
					}

					if (genero == 2) {
						List<String> artista2 = new ArrayList<>(); // sempre voltado a interface
						artista2.add("The Scarecrow - Avantasia");
						artista2.add("The Clansman - Iron Maiden");
						artista2.add("Senjutsu - Iron Maiden");
						artista2.add("Wuthering Heights - Angra");
						artista2.add("A Tale That Wasn’t Right - Helloween");
						artista2.add("Panic Attack - Dream Theater");

						Collections.sort(artista2);
						System.out.println("Reproduzindo...\n");
						System.out.println(artista2.get(1));
						reproducao.iniciar();
						System.out.println("\nPróximas faixas:\n");
						System.out.println(artista2.get(2));
						System.out.println(artista2.get(3));
						System.out.println("\n");
						x = Voltar();
					}

					if (genero == 3) {
						List<String> artista3 = new ArrayList<>(); // sempre voltado a interface
						artista3.add("Electric Feel - MGMT");
						artista3.add("When The Sun Goes Down - Arctic Monkeys");
						artista3.add("Arabela - Arctic Monkeys");
						artista3.add("Bad Habit - The Kooks");
						artista3.add("Lonely Boy - The Black Keys");
						artista3.add("Helena Beat - Foster The People");

						Collections.sort(artista3);
						System.out.println("Reproduzindo....\n");
						System.out.println(artista3.get(1));
						reproducao.iniciar();
						System.out.println("\nPróximas faixas:\n");
						System.out.println(artista3.get(2));
						System.out.println(artista3.get(3));
						System.out.println("\n");
						x = Voltar();
					}

					if (genero == 4) {
						List<String> artista4 = new ArrayList<>(); // sempre voltado a interface
						artista4.add("Stay - The Kid LAROI");
						artista4.add("Cradles - Sub Urban");
						artista4.add("Stay - Rihanna");
						artista4.add("Monteiro - Lil Nas X");
						artista4.add("Freak - Sub Urban");
						artista4.add("Alejandro - Lady Gaga");

						Collections.sort(artista4);
						System.out.println("Reproduzindo...\n");
						System.out.println(artista4.get(1));
						reproducao.iniciar();
						System.out.println("\nPróximas faixas:\n");
						System.out.println(artista4.get(2));
						System.out.println(artista4.get(3));
						System.out.println("\n");
						x = Voltar();
					}
					if (genero == 5) {
						List<String> artista5 = new ArrayList<>(); // sempre voltado a interface
						artista5.add("Love Tonight - David Guetta");
						artista5.add("Pressure - Martin Garrix e Tove lo");
						artista5.add("Alive and Feeling Fine - The Suncatchers");
						artista5.add("Faded - Alan Walker");
						artista5.add("Lean On - Major Lazer, MØ, DJ Snake");
						artista5.add("Titanium - David Guetta");

						Collections.sort(artista5);
						System.out.println("Reproduzindo....\n");
						System.out.println(artista5.get(1));
						reproducao.iniciar();
						System.out.println("\nPróximas faixas:\n");
						System.out.println(artista5.get(2));
						System.out.println(artista5.get(3));
						System.out.println("\n");
						x = Voltar();
					}

					if (genero == 6) {
						List<String> artista6 = new ArrayList<>(); // sempre voltado a interface
						artista6.add("Super Fantástico - A turma do balão mágico");
						artista6.add("A Galinha magricela - Eliana");
						artista6.add("Livre Estou - Taryn Szpilman");
						artista6.add("O patinho colorido - Bento e Totó");
						artista6.add("Vestido Azul - Floribella");
						artista6.add("Uni Duni Te - Trem da Alegria");

						Collections.sort(artista6);
						System.out.println("Reproduzindo....\n");
						System.out.println(artista6.get(1));
						reproducao.iniciar();
						System.out.println("\nPróximas faixas:\n");
						System.out.println(artista6.get(2));
						System.out.println(artista6.get(3));
						System.out.println("\n");
						x = Voltar();
					}
				}
				if (resposta == 2) {
					artista = MostraMenu3();
					if (artista == 1) {
						List<String> Zeca = new ArrayList<>(); // sempre voltado a interface
						Zeca.add("Verdade - Zeca Pagodinho");
						Zeca.add("Deixa a vida me levar - Zeca Pagodinho");

						System.out.println("Reproduzindo....\n");
						System.out.println(Zeca.get(0));
						reproducao.iniciar();
						System.out.println("\nPróxima faixa:\n");
						System.out.println(Zeca.get(1));
						System.out.println();
						x = Voltar();
					}

					if (artista == 2) {
						List<String> Iron = new ArrayList<>(); // sempre voltado a interface
						Iron.add("The Clansman - Iron Maiden");
						Iron.add("Senjutsu - Iron Maiden");

						System.out.println("Reproduzindo....\n");
						System.out.println(Iron.get(0));
						reproducao.iniciar();
						System.out.println("\nPróxima faixa:\n");
						System.out.println(Iron.get(1));
						System.out.println();
						x = Voltar();
					}

					if (artista == 3) {
						List<String> Arctic = new ArrayList<>(); // sempre voltado a interface
						Arctic.add("Arabela - Arctic Monkeys");
						Arctic.add("When The Sun Goes Down - Arctic Monkeys");

						System.out.println("Reproduzindo....\n");
						System.out.println(Arctic.get(0));
						reproducao.iniciar();
						System.out.println("\nPróxima faixa:\n");
						System.out.println(Arctic.get(1));
						System.out.println();
						x = Voltar();
					}

					if (artista == 4) {
						List<String> Sub = new ArrayList<>(); // sempre voltado a interface
						Sub.add("Cradles - Sub Urban");
						Sub.add("Freak - Sub Urban");

						System.out.println("Reproduzindo....\n");
						System.out.println(Sub.get(0));
						reproducao.iniciar();
						System.out.println("\nPróxima faixa:\n");
						System.out.println(Sub.get(1));
						System.out.println();
						x = Voltar();
					}
					if (artista == 5) {
						List<String> David = new ArrayList<>(); // sempre voltado a interface
						David.add("Titanium - David Guetta");
						David.add("Love Tonight - David Guetta");

						System.out.println("Reproduzindo....\n");
						System.out.println(David.get(0));
						reproducao.iniciar();
						System.out.println("\nPróxima faixa:\n");
						System.out.println(David.get(1));
						System.out.println();
						x = Voltar();
					}

					if (artista == 6) {
						List<String> Eliana = new ArrayList<>(); // sempre voltado a interface
						Eliana.add("A galinha magricela - Eliana");
						Eliana.add("Dedinhos - Eliana");

						System.out.println("Reproduzindo....\n");
						System.out.println(Eliana.get(0));
						reproducao.iniciar();
						System.out.println("\nPróxima faixa:\n");
						System.out.println(Eliana.get(1));
						System.out.println();
						x = Voltar();
					}
				}
				if (resposta == 3) {
					System.out.println("Reproduzindo no aleatório... \n");
					String[] opcoes = { "The Scarecrow -  Avantasia","Iron Maiden - The Clansman","Iron Maiden - Senjutsu","Angra - Wuthering Heights","Helloween - A Tale That Wasn’t Right","Dream Theater - Panic Attack","MGMT - Electric Feel","Arctic Monkeys - When The Sun Goes Down",
							"Arctic Monkeys - Arabela","The Kooks - Bad Habit","The Black Keys - Lonely Boy","Foster The People - Helena Beat","The Kid LAROI - STAY","Sub Urban - Cradles","Rihanna - Stay","Lil Nas X - MONTERO","Sub Urban - Freak",
							"Fundo de quintal - O show tem que continuar","Xande de pilares - Tá escrito","Zeca Pagodinho - Verdade","Arlindo Cruz - O meu lugar","João Nogueira - Espelho","Zeca Pagodinho - Deixa a vida me levar","A turma do balão mágico - Super Fantástico",
							"Eliana - A Galinha magricela","Eliana - Dedinhos","Taryn Szpilman - Livre Estou","Bento e Totó - O patinho colorido","Floribella - Vestido Azul","Trem da Alegria - Uni Duni Tê","David Guetta - Love Tonight","David guetta - Titanium",
							"Martin Garrix e Tove lo - Pressure(feat. Tove lo)","Michel Fanno - Alive and Feeling Fine","Alan Walker - Faded", "M,DJ Snake - Lean On"};
					
					String selecionada1 = opcoes[new Random().nextInt(opcoes.length)];
					System.out.println(selecionada1);
					reproducao.iniciar();
					System.out.println();
					x = Voltar();
				}
			} catch (ArithmeticException erro) {
				System.out.println(nome + " Desculpe, não entendemos o que você quis dizer, tente novamente\n");
			} catch (InputMismatchException erro) {
				System.out.println(nome + " Desculpe, não entendemos o que você quis dizer, tente novamente\n");
			} catch (Exception erro) {
				System.out.println(nome + " Desculpe, não entendemos o que você quis dizer, tente novamente\n");

			}
		}
		System.out.println("Ei, " + nome
				+ "! Agradecemos sua presença no nosso player.\nEsperamos escutar músicas com você novamente, até breve!\n");

	}
}
