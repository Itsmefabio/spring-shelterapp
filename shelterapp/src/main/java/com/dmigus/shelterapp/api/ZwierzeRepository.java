package com.dmigus.shelterapp.api;

import com.dmigus.shelterapp.beans.Zwierze;
import org.springframework.data.repository.CrudRepository;

public interface ZwierzeRepository extends CrudRepository<Zwierze, Long> {
}
