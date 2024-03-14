// Classe repr�sentant un GPS (appareil permettant de conna�tre sa position).
package sujet;

public  class Gps implements IObservable{
	private double position[];// Position du GPS. [latitude,longitude]
	private int precision;// Pr�cision accord� � cette position (suivant le nombre de satellites utilis�s).

	public Gps() {
		position = new double[2];
		position[0]=position[1]= -1.0;
		precision = 0;
	}

	// M�thode qui permet de mettre � jour de fa�on artificielle le GPS.
	// Dans un cas r�el, on utiliserait les valeurs retourn�es par les capteurs.
	public void setMesures(double position[], int precision) {
		// Et c'est donc ici que l'on informe (notifie) les �ventuels observateurs...
	}

	// M�thode "tir�" donc c'est aux observateurs d'aller chercher les valeurs d�sir� gr�ce � un objet Gps.	��������
	// Pour cela on trouve un accesseur en lecture pour position.
	// DD : Decimal Degrees
	public String getPositionDD()
	{
		return "[" + position[0] + "," + position[1] + "]";
	}

	// Pour un observateur s'int�ressant uniquement au formet DMs de la position GPS
	// DMS : Degrees Minutes Seconds
	public String getPositionDMS() {
		return convertToDms(position[0],false) + " / " + convertToDms(position[1],true);
	}

	private String convertToDms(double dd, boolean isLng) {
		String dir = dd<0 ? isLng ? "W" : "S": isLng ? "E" : "N";

		double absDd = Math.abs(dd);
		double deg = (int)absDd | 0;
		double frac = absDd - deg;
		double min = (int)(frac * 60) | 0;
		double sec = frac * 3600 - min * 60;
		// Round it to 2 decimal points.
		sec = Math.round(sec * 100) / 100;
		return deg + "� " + min + "' " + sec + "\" " + dir;
	}

	// Un accesseur en lecture pour la pr�cision.
	public int getPrecision()
	{
		return precision;
	}
	public double[] getPosition() {
		return position;
	}

	
}
