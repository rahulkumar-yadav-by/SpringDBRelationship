package com.spring.database.relationship.SpringDBRelationship.OneToMany.service;

import com.spring.database.relationship.SpringDBRelationship.OneToMany.entity.Registration;
import com.spring.database.relationship.SpringDBRelationship.OneToMany.entity.Tournament;
import com.spring.database.relationship.SpringDBRelationship.OneToMany.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;

    //finAll
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    public Registration getRegistrationById(int id){
        return registrationRepository.findById(id).get();
    }
    public void deleteRegistration(int id){
        registrationRepository.deleteById(id);
    }
    public Registration addRegistration(Registration registration){
        return registrationRepository.save(registration);
    }


}