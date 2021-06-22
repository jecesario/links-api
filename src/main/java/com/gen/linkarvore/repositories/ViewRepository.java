package com.gen.linkarvore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.linkarvore.models.View;

@Repository
public interface ViewRepository extends JpaRepository<View, Long> {

}
