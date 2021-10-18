package com.registrationform.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrationform.api.domain.CreateRegFromDto;
import com.registrationform.api.domain.RegForm;
import com.registrationform.api.domain.RegFormView;
import com.registrationform.api.mapper.RegFormMapper;
import com.registrationform.api.repository.RegFormRepository;

@Service
public class RegFormService {
	@Autowired
	RegFormRepository regFormRepository;

	@Autowired
	RegFormMapper formMapper;

	public RegFormView createRegFrom(CreateRegFromDto dto) {
		RegForm regForm = formMapper.getRegFormFromCreateRegFormDto(dto);

		regFormRepository.save(regForm);

		return formMapper.getRegFromViewFromRegForm(regForm);
	}
}
