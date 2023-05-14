/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.educacionModel;
import com.portfolio.Backend.repositories.IeducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class educacionService implements IeducacionService {
    
    @Autowired
  private IeducacionRepository educacionRepository;

    @Override
    public List getEducacion() {
        return educacionRepository.findAll();
    }

    @Override
    public Optional getEducacionPorId(Long id) {
        return educacionRepository.findById(id);
    }

    @Override
    public educacionModel addEducacion(educacionModel edu) {
        return educacionRepository.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        educacionRepository.deleteById(id);
    }
    
}
