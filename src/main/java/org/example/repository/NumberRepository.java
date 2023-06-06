package org.example.repository;

import org.example.models.ColorEntity;
import org.example.models.NumberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<NumberEntity, Long> {
}
