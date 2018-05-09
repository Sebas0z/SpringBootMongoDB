package com.ceiba.bootmongodb.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ceiba.bootmongodb.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
