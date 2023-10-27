package com.project.mongodbproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.mongodbproject.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
