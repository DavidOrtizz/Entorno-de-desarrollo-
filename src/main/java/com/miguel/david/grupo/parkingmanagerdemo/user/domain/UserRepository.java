package com.miguel.david.grupo.parkingmanagerdemo.user.domain;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author David Ortiz y Miguel Cedric
 * @version 0.0.1
 * @since 12/04/2023
 * Guarda la informacion de los usuarios
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
