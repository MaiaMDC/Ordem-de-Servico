package com.marcio.os.services;

import com.marcio.os.domain.Cliente;
import com.marcio.os.domain.OS;
import com.marcio.os.domain.Tecnico;
import com.marcio.os.enums.Prioridade;
import com.marcio.os.enums.Status;
import com.marcio.os.repositories.ClienteRepository;
import com.marcio.os.repositories.OSRepository;
import com.marcio.os.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private OSRepository osRepository;

    public void instanciaDB() {
        Tecnico t1 = new Tecnico(null, "Valdir Cezar", "829.429.130-70", "(11) 98888-8888");
        Cliente c1 = new Cliente(null, "Betina Campos", "136.921.070-13", "(11) 98888-8887");

        OS os1 = new OS(null, Prioridade.ALTA, "Teste create OD", Status.ANDAMENTO, t1, c1);


        tecnicoRepository.saveAll(Arrays.asList(t1));
        clienteRepository.saveAll(Arrays.asList(c1));
        osRepository.saveAll(Arrays.asList(os1));

    }

}
