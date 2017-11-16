package br.inatel.dm110.clientes.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.inatel.dm110.clientes.model.ClientModel;


@Path("/client")
public interface ClientService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<ClientModel> listAllClients();
		
	@POST
	@Path("/insert")
	@Consumes(MediaType.APPLICATION_JSON)
	void createNewClient(ClientModel client); 

}
