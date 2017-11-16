package br.inatel.dm110.clientes.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.clientes.dao.ClientDAO;
import br.inatel.dm110.clientes.entities.Client;
import br.inatel.dm110.clientes.interfaces.ClientLocal;
import br.inatel.dm110.clientes.interfaces.ClientRemote;
import br.inatel.dm110.clientes.model.ClientModel;

@Stateless
@Remote(ClientRemote.class)
@Local(ClientLocal.class)
public class ClientBean implements ClientRemote, ClientLocal {
	
	@EJB
	private ClientDAO clientDAO;

	@Override
	public List<ClientModel> listClients() {
		
		List<ClientModel> allClients = new ArrayList<>();

        for (Client c : clientDAO.listAll()) {
            
        	ClientModel client = new ClientModel();
            client.setName(c.getName());
            client.setEmail(c.getEmail());
            allClients.add(client);
        }

        return allClients;
	}

	@Override
	public void createNewClient(String name, String email) {
				
		Client client = new Client();
		client.setName(name);
		client.setEmail(email);
		clientDAO.insert(client);
	}
}
