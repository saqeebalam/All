package com.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form.entities.LeadEntity;

public interface LeadRepository extends JpaRepository<LeadEntity, Long> {

}
