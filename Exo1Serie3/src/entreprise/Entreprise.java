package entreprise;
import service.*;

import java.util.ArrayList;
import java.util.List;

import service.ServAdministratif;
import service.Service;

public class Entreprise {
	private List<Service> _Services = new ArrayList<Service>();
	
	// Ajout d'un service
	public void addService (String nom, String type) throws IllegalArgumentException, ServiceExistantException {
		Service service = null;
		if (type.equals("Administratif")) 
			service = new ServAdministratif(nom);
		else if (type.equals("Technique"))
			service = new ServTechnique(nom);
		else
			throw new IllegalArgumentException ("type");
		if (this.searchServiceByName(nom) != null)
			throw new ServiceExistantException (nom);
		this._Services.add(service);		
	}
	
	// Recherche de services par nom (clé de gestion)
	public Service searchServiceByName (String nom){		
		for (Service service : _Services)
			if (service.getNom().equals(nom))
				return service;
		return null;
	}	
}
