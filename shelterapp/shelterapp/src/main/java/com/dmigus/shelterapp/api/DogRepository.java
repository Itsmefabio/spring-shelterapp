package com.dmigus.shelterapp.api;

import com.dmigus.shelterapp.beans.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
