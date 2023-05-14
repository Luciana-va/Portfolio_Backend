/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.skillsModel;
import java.util.List;
import java.util.Optional;


public interface IskillsService {
    
    public List getSkills();
    
    public Optional getSkillPorId(Long id);
    
    public skillsModel addSkill(skillsModel skill);
    
    public void deleteSkill (Long id);
}
