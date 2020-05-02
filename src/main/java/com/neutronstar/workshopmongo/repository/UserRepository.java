package com.neutronstar.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neutronstar.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
