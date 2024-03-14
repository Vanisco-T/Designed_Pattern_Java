package service;

public class ServAdministratif extends Service {
	public ServAdministratif(String nom) {
		super(nom);		
	}
	
	@Override
	public String getType() {		
		return "Administratif";
	}	
}
