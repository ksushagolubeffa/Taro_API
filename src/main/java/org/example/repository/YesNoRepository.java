package org.example.repository;

import org.example.models.ColorEntity;
import org.example.models.YesNoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YesNoRepository extends JpaRepository<YesNoEntity, Long> {
}
