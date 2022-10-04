package com.spring.database.relationship.SpringDBRelationship.OneToMany.controller;


import com.spring.database.relationship.SpringDBRelationship.OneToMany.entity.Registration;
import com.spring.database.relationship.SpringDBRelationship.OneToMany.entity.Tournament;
import com.spring.database.relationship.SpringDBRelationship.OneToMany.service.RegistrationService;
import com.spring.database.relationship.SpringDBRelationship.OneToMany.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {


    @Autowired
    TournamentService tournamentService;

    @Autowired
    RegistrationService registrationService;

    @GetMapping
    public List<Tournament> getAllPlayers(){
        return tournamentService.getAllTournament();
    }

    @GetMapping("/{id}")
    public Tournament getTournamentByID(@PathVariable int id){
        return tournamentService.getTournamentById(id);
    }

    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament){
        return tournamentService.addTournament(tournament);
    }

    @DeleteMapping("{id}")
    public void deleteTournament(@PathVariable int id){
        tournamentService.deleteTournament(id);
    }

    @PutMapping("/{id}/addRegistration/{registration_id}")
    public Tournament addRegistration(@PathVariable int id, @PathVariable int registration_id){
        Registration registration=registrationService.getRegistrationById(registration_id);
        System.out.println(registration);
        return tournamentService.addRegistration(id,registration);
    }

    @PutMapping("/{id}/removeRegistration/{registration_id}")
    public Tournament removeRegistration(@PathVariable int id, @PathVariable int registration_id){
        Registration registration=registrationService.getRegistrationById(registration_id);
        System.out.println(registration);
        return tournamentService.removeRegistration(id,registration);
    }

}
