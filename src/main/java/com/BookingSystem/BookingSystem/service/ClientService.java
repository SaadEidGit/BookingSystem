package com.BookingSystem.BookingSystem.service;

import com.BookingSystem.BookingSystem.model.Client;
import com.BookingSystem.BookingSystem.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(Client client){
        return clientRepository.save(client);
    }


    public void deleteClient(Client client){
        clientRepository.deleteById(client.getId());
    }
}
