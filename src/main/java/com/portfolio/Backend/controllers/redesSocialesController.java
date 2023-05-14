/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.controllers;



import com.portfolio.Backend.models.redesSocialesModel;
import com.portfolio.Backend.services.IredesSocialesService;
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
@RequestMapping("/api/RedesSociales")
public class redesSocialesController {
    
     @Autowired 
    private IredesSocialesService redesSocialesService;
    
    @CrossOrigin ( origins = "*")
    @GetMapping
    public ResponseEntity<?> traerRedes(){
        return ResponseEntity.ok(redesSocialesService.getRedesSociales());
    }
    
    @CrossOrigin ( origins = "*")
    @GetMapping("{id}")
    public ResponseEntity<?> traerRedId(@PathVariable Long id){
        Optional<redesSocialesModel> oRedesSociales = redesSocialesService.getRedSocial(id);
        if (oRedesSociales.isPresent()){
            return ResponseEntity.ok(oRedesSociales);
        }
        return ResponseEntity.notFound().build();
    }
    
    @CrossOrigin ( origins = "*")
    @PostMapping
    public ResponseEntity<?> postRed(@RequestBody redesSocialesModel red){
        return ResponseEntity.status(HttpStatus.CREATED).body(redesSocialesService.addRedSocial(red));
    }
    
    @CrossOrigin ( origins = "*")
    @DeleteMapping("/{id}")
   public ResponseEntity<?> eliminarRed(@PathVariable Long id){
       Optional<redesSocialesModel> oRedesSociales = redesSocialesService.getRedSocial(id);
       if (oRedesSociales.isPresent()){
           redesSocialesService.deleteRedSocial(id);
           return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
       }
       return ResponseEntity.notFound().build();
   }
   
   @CrossOrigin ( origins = "*")
   @PutMapping("/{id}")
    public ResponseEntity<?> modificarRedId(@PathVariable Long id, @RequestBody redesSocialesModel red){
        Optional<redesSocialesModel> oRedesSociales = redesSocialesService.getRedSocial(id);
        if (oRedesSociales.isPresent()){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(redesSocialesService.addRedSocial(red));
        }
        return ResponseEntity.notFound().build();
    }
}
