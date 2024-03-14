package commande;

import livraison.IModel;

public class Commande implements ICommande {
	private double montant ;
	private double poids ;
	private IModel m1;
	
	public Commande(double montant, double poids,IModel m1) {		
		assert montant > 0 && poids > 0;
		this.montant = montant;
		this.poids = poids;		
		this.m1=m1;
	}
	
	public double calculerCoutLivraison () {
		//return this.montant * Commande.tauxLivraison;
		return m1.calculerCoutLivraison(this);
	}

	public double getMontant() {
		return montant;
	}

	public double getPoids() {
		return poids;
	}
	
}
