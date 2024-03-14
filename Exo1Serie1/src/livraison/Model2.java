package livraison;

import commande.Commande;

public class Model2 implements IModel{
	public double calculerCoutLivraison(Commande commande) {
		if(commande.getPoids()<2)
			return 2;
		else
			return 9;
	}

}
