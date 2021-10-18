package com.registrationform.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registrationform.api.domain.CreateRegFromDto;
import com.registrationform.api.domain.RegFormView;
import com.registrationform.api.service.RegFormService;

@RestController
@RequestMapping("api/reg/")
public class RegFormController {

	@Autowired
	RegFormService service;

	@PostMapping("create/")
	public ResponseEntity<RegFormView> createTenant(@RequestBody @Valid CreateRegFromDto dto) {

		return ResponseEntity.ok().body(service.createRegFrom(dto));
	}
}
