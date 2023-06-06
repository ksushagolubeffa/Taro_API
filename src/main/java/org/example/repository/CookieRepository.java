package org.example.repository;

import org.example.models.ColorEntity;
import org.example.models.CookieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CookieRepository extends JpaRepository<CookieEntity, Long> {
}
