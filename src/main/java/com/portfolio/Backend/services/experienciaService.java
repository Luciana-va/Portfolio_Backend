/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.experienciaModel;
import com.portfolio.Backend.repositories.IexperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class experienciaService implements IexperienciaService{

    @Autowired
    private IexperienciaRepository experienciaRepository;
    
    @Override
    public List getExperiencia() {
        return experienciaRepository.findAll();
    }

    @Override
    public Optional getExperienciaPorId(Long id) {
        return experienciaRepository.findById(id);
    }

    @Override
    public experienciaModel addExperiencia(experienciaModel expe) {
        return experienciaRepository.save(expe);
    }

    @Override
    public void deleteExpeiencia(Long id) {
        experienciaRepository.deleteById(id);
    }
}
