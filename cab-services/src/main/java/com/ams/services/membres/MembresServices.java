package com.ams.services.membres;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ams.communs.pojos.Membre;

@Path("/membres")
public class MembresServices {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Membre> listeDesMembres(){
		List<Membre> membres = new ArrayList<Membre>();
		membres.add(new Membre("Jean", "Paul"));
		membres.add(new Membre("Marc", "Antoine"));
		return membres;
	}

}
