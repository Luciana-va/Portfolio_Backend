/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.controllers;

import com.portfolio.Backend.models.skillsModel;
import com.portfolio.Backend.services.IskillsService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skills")
public class skillsController {
    
    @Autowired
    private IskillsService skillsService;
    
    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> traerSkill(){
        return ResponseEntity.ok(skillsService.getSkills());
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("{id}")
    public ResponseEntity<?> traerSkillId(@PathVariable Long id){
        Optional<skillsModel> oSkills = skillsService.getSkillPorId(id);
        if (oSkills.isPresent()){
            return ResponseEntity.ok(oSkills);
        }
        return ResponseEntity.notFound().build();
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> postSkill(@RequestBody skillsModel skill){
        return ResponseEntity.status(HttpStatus.CREATED).body(skillsService.addSkill(skill));
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarSkill(@PathVariable Long id){
       Optional<skillsModel> oSkills = skillsService.getSkillPorId(id);
       if (oSkills.isPresent()){
           skillsService.deleteSkill(id);
           return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
       }
       return ResponseEntity.notFound().build();
   }
    
    @CrossOrigin(origins = "*")
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarSkillId(@PathVariable Long id, @RequestBody skillsModel skill){
        Optional<skillsModel> oSkills = skillsService.getSkillPorId(id);
        if (oSkills.isPresent()){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(skillsService.addSkill(skill));
        }
        return ResponseEntity.notFound().build();
    }
    
    
}

