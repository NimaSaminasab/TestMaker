package com.example.testmaker;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Person, Long> {
}
