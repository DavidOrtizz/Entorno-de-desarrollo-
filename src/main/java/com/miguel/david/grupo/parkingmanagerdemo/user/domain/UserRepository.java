package com.miguel.david.grupo.parkingmanagerdemo.user.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Guarda la informacion de los usuarios
 * 
 * @author Miguel Villoslada
 * @author David Ortiz
 * @version 0.0.1
 * @since 12/04/2023
 * 
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public User findByEmail(String email);
    
}

