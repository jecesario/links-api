package com.gen.linkarvore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.linkarvore.models.Click;

@Repository
public interface ClickRepository extends JpaRepository<Click, Long> {

}
