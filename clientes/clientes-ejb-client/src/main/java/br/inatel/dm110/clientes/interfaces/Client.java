package br.inatel.dm110.clientes.interfaces;

import java.util.List;

import br.inatel.dm110.clientes.model.ClientModel;


public interface Client {
	
	List<ClientModel> listClients();

	void createNewClient(String name, String email);

}
