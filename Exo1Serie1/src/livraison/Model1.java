package livraison;

import commande.Commande;

public class Model1 implements IModel{
	private static double tauxLivraison=0.1;
	public double calculerCoutLivraison(Commande commande) {
		return commande.getMontant()*tauxLivraison;
	}

}
