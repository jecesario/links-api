package com.gen.linkarvore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.linkarvore.models.Link;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {

}
