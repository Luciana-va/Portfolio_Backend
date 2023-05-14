/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.skillsModel;
import com.portfolio.Backend.repositories.IskillsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class skillsService implements IskillsService{

    @Autowired
    private IskillsRepository skillsRepository;
    
    @Override
    public List getSkills() {
        return skillsRepository.findAll();
    }

    @Override
    public Optional getSkillPorId(Long id) {
        return skillsRepository.findById(id);
    }

    @Override
    public skillsModel addSkill(skillsModel skill) {
        return skillsRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillsRepository.deleteById(id);
    }
    
}
