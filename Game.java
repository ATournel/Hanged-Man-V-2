import java.util.Scanner;

public class Game {
	
//Consigne au joueur + nombre de lettres dans le mot
	
	public static void consigne(int a) {
		System.out.println("Trouvez un mot de " + a + " lettres,");
		System.out.println("Vous avez 10 essais!");
		System.out.println(motAffi);
		System.out.println("Proposez une lettre:");
	}
	
//Partie
	
	public static int essais = 10;
	public static int score = 500;
	public static String motAffi = "------";
	private static Scanner uW;
	private static int x;
	
	public static void partie(String wordToFind) {
		uW = new Scanner(System.in);
		while (essais > 0 || motAffi.equals(wordToFind)) {
			final char userWord = uW.next().charAt(0);
			
				if (motAffi.equals(wordToFind)) {
					System.out.println("Vous avez gagné!");
					System.out.println("Le mot était : " + motAffi);
					System.out.println("Score: " + score + ".");
				}
				else if(wordToFind.contains(""+userWord)==true) {
					for (int x = 0; x<6; x++) {
					if (userWord == wordToFind.charAt(x)) {
						char[] motAffiChars = motAffi.toCharArray();
						motAffiChars[x] = userWord;
						motAffi = String.valueOf(motAffiChars);
					} 
					else {
						
					}
					}
					System.out.println(motAffi);
				}
					
				else {
						if (essais > 2) {
						essais = essais-1;
						score = score-10;
						System.out.println("La lettre '" + userWord + "'" + " n'est pas dans le mot!");
						System.out.println("Vous avez " + essais + " essais restants!");
						System.out.println(motAffi);
						}
						else if (essais > 1) {
							essais = essais-1;
							score = score-10;
							System.out.println("La lettre '" + userWord + "'" + " n'est pas dans le mot!");
							System.out.println("Vous avez " + essais + " essai restant!");
						}
						else {
							essais = essais-1;
							System.out.println("Vous avez perdu!");
						}
					}
				
				
			  }
			}
		
	public static void main(String[] args) {
//Indiquer nombre de lettres
		consigne(6);
//Indiquer mot à trouver		
		partie("bisous");
	}

}