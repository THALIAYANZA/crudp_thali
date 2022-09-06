/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.crud.Service;

import com.example.crud.Repository.PersonaRepository;
import com.example.crud.model.Persona;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author THALY
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    PersonaRepository personarepository;
    
    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personarepository;
    }
    
    
}
