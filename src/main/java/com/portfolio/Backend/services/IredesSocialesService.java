/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.redesSocialesModel;
import java.util.List;
import java.util.Optional;


public interface IredesSocialesService {
    
    public List getRedesSociales();
    
    public Optional getRedSocial(Long id);
    
    public redesSocialesModel addRedSocial(redesSocialesModel red);
    
    public void deleteRedSocial (Long id);
    
}
