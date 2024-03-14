import sujet.Gps;

public class Main {
	public static void main(String[] args) {
		// Cr�ation de l'objet Gps observable.
		Gps g = new Gps();
		
		// Cr�ation de 3 observateurs AfficheResumeDD, AfficheComplet et AfficheResumeDMS


		// On simule l'arriv�e de nouvelles valeurs via des capteurs.
		// MAIS personne n'est int�ress� (pas encore d'observateur)
		double point0[] = {9.9,32.789};
		System.out.println("\nTous les gens int�ress�s seront automatiquement mis au courant !");
		g.setMesures(point0, 4);
		
		// On ajoute AfficheResume comme premier observateur de Gps.

		
		// On simule l'arriv�e de nouvelles valeurs via des capteurs.
		double point1[] = {1.345,6.899};
		System.out.println("\nTous les gens int�ress�s seront automatiquement mis au courant !");
		g.setMesures(point1, 4);

		// On ajoute AfficheComplet comme second observateur de Gps.

		
		// Nouvelle simulation d'arriv�e de nouvelles valeurs via des capteurs.
		double point2[] = {50.665,11.101};
		System.out.println("\nTous les gens int�ress�s seront automatiquement mis au courant !");
		g.setMesures(point2, 5);
		
		// On ajoute AfficheResumeDMS comme troisi�me observateur de Gps.

		
		// Nouvelle simulation d'arriv�e de nouvelles valeurs via des capteurs.
		double point3[] = {48.858370,2.294481};
		System.out.println("\nTous les gens int�ress�s seront automatiquement mis au courant !");
		g.setMesures(point3, 10);
	}
}