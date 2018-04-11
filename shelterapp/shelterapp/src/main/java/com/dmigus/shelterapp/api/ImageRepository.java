package com.dmigus.shelterapp.api;

import com.dmigus.shelterapp.beans.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
