package ExecucaoMusicas;

import java.util.Scanner;

public class Menus {

	public static int MostraMenu(){
	    Scanner leia = new Scanner (System.in);
	    System.out.println("Queremos saber de que forma você deseja ouvir suas musicas!!");
	    System.out.println("\n Digite [1]- Para escolher por genero");
	    System.out.println("\n Digite [2]- Para escolher por artistas");
	    System.out.println("\n Digite [3]- Para ouvir no aleatorio");
	    return Integer.parseInt(leia.nextLine());
    }
}
