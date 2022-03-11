package org.generation.brazil;

import java.util.Random;
import java.util.Scanner;

public class Menus {

	public static int MostraMenu(){
	    Scanner leia = new Scanner (System.in);
	    System.out.println("Queremos saber de que forma você deseja ouvir suas musicas!!");
	    System.out.println("\n Digite [1]- Para escolher o genero musical");
	    System.out.println("\n Digite [2]- Para escolher por artistas");
	    System.out.println("\n Digite [3]- Para ouvir no aleatorio");
	    return Integer.parseInt(leia.nextLine());}
	
	public static int MostraMenu2(){
		Scanner leia = new Scanner (System.in);
		System.out.println("Os generos disponiveis são: ");
		System.out.println("[1]- Samba");
		System.out.println("[2]- Heavy Metal");
		System.out.println("[3]- Indie Rock");
		System.out.println("[4]- Pop");
		System.out.println("[5]- Eletronica");
		System.out.println("[6]- Infantil");
		return Integer.parseInt(leia.nextLine());}
	
	public static int MostraMenu3(){
		Scanner leia = new Scanner (System.in);
		System.out.println("Os artistas disponiveis são: ");
		System.out.println("[1]- Zeca Pagodinho");
		System.out.println("[2]- Iron Maiden");
		System.out.println("[3]- Arctic Monkeys");
		System.out.println("[4]- Sub Urban");
		System.out.println("[5]- David Guetta");
		System.out.println("[6]- Eliana");
		return Integer.parseInt(leia.nextLine());}
	
	public static int Voltar(){
		Scanner leia = new Scanner (System.in);
		System.out.println("O que você deseja fazer a seguir?\n");
		System.out.println("[1]Retornar ao menu inicial");
		System.out.println("[0]Sair");
		return Integer.parseInt(leia.nextLine());}
	
	
	
	}
