package com.spring.database.relationship.SpringDBRelationship.OneToMany.controller;

import com.spring.database.relationship.SpringDBRelationship.OneToMany.entity.Registration;
import com.spring.database.relationship.SpringDBRelationship.OneToMany.service.RegistrationService;
import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.Player;
import com.spring.database.relationship.SpringDBRelationship.oneToone.entity.PlayerProfile;
import com.spring.database.relationship.SpringDBRelationship.oneToone.service.PlayerProfileService;
import com.spring.database.relationship.SpringDBRelationship.oneToone.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @GetMapping
    public List<Registration> getAllPlayers(){
              return registrationService.findAll();
    }

    @GetMapping("/{id}")
    public Registration getRegistrationByID(@PathVariable int id){
        return registrationService.getRegistrationById(id);
    }

    @PostMapping
    public Registration addRegistration(@RequestBody Registration registration){
        return registrationService.addRegistration(registration);
    }

    @DeleteMapping("{id}")
    public void deleteRegistration(@PathVariable int id){
        registrationService.deleteRegistration(id);
    }


}
