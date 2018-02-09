package com.dmigus.shelterapp.api;

import com.dmigus.shelterapp.beans.Konto;
import org.springframework.data.repository.CrudRepository;

public interface KontoRepository extends CrudRepository<Konto, Long> {
}
