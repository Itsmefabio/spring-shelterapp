package com.dmigus.shelterapp.api;

import com.dmigus.shelterapp.beans.Zwierze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ZwierzeRepository extends JpaRepository<Zwierze, Long> {

}
