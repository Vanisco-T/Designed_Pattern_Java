
public abstract class Commande {
	private int numero;

	public Commande(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	public double getMontantTTC() {	
		return this.getMontantHT() * (1 + this.getTva()) + this.getFraisLivraison();
	}
	protected double montantHT;
	public double getMontantHT() {
		return montantHT;
	}
	//public abstract double getMontantTTC();
	public abstract double getFraisLivraison();
	public abstract double getTva();
	
}
