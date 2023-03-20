package com.marcio.os.controller;

import com.marcio.os.dtos.TecnicoDTO;
import com.marcio.os.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoControler {

    @Autowired
    private TecnicoService service;
    @GetMapping(value = "/{id}")
    public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id){
        TecnicoDTO objDTO = new TecnicoDTO(service.findById(id));
        return ResponseEntity.ok().body(objDTO);
    }

}
