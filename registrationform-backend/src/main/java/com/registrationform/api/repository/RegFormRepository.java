package com.registrationform.api.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.registrationform.api.domain.RegForm;

public interface RegFormRepository extends CrudRepository<RegForm, Integer> {
	Optional<RegForm> findById(Integer id);
}
