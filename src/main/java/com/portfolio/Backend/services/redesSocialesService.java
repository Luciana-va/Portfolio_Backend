/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.redesSocialesModel;
import com.portfolio.Backend.repositories.IredesSocialesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class redesSocialesService implements IredesSocialesService{
    
     @Autowired
  private IredesSocialesRepository redesSocialesRepository;

    @Override
    public List getRedesSociales() {
        return redesSocialesRepository.findAll();
    }

    @Override
    public Optional getRedSocial(Long id) {
        return redesSocialesRepository.findById(id);
    }

    @Override
    public redesSocialesModel addRedSocial(redesSocialesModel red) {
        return redesSocialesRepository.save(red);
    }

    @Override
    public void deleteRedSocial(Long id) {
        redesSocialesRepository.deleteById(id);
    }
     
     
    
}
