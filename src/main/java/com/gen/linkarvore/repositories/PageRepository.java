package com.gen.linkarvore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.linkarvore.models.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Long> {

}
