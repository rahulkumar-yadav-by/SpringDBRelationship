package com.spring.database.relationship.SpringDBRelationship.OneToMany.repository;

import com.spring.database.relationship.SpringDBRelationship.OneToMany.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
}
