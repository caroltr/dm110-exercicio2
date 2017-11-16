package br.inatel.dm110.clientes.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.clientes.api.ClientService;
import br.inatel.dm110.clientes.interfaces.ClientRemote;
import br.inatel.dm110.clientes.model.ClientModel;

@RequestScoped
public class ClientServiceImpl implements ClientService {

	@EJB(lookup = "java:app/clientes-ejb-0.1-SNAPSHOT/ClientBean!br.inatel.dm110.clientes.interfaces.ClientRemote")
	private ClientRemote clientBean;
	
	@Override
	public List<ClientModel> listAllClients() {
				
		return clientBean.listClients();
	}

	@Override
	public void createNewClient(ClientModel client) {
				
		clientBean.createNewClient(client.getName(), client.getEmail());
	}

}
