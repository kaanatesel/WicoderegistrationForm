package com.registrationform.api.mapper;

import org.mapstruct.Mapper;

import com.registrationform.api.domain.CreateRegFromDto;
import com.registrationform.api.domain.RegForm;
import com.registrationform.api.domain.RegFormView;

@Mapper
public abstract class RegFormMapper {

	public abstract RegForm getRegFormFromCreateRegFormDto(CreateRegFromDto dto);

	public abstract RegFormView getRegFromViewFromRegForm(RegForm form);
}
