package com.marcio.os.services;

import com.marcio.os.domain.Tecnico;
import com.marcio.os.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TecnicoService {


    @Autowired
    private TecnicoRepository repository;
    public Tecnico findById(Integer id){
        Optional<Tecnico> obj = repository.findById(id);
        return obj.orElse(null);
    }

}
