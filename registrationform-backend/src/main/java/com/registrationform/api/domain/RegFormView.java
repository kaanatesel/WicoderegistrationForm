package com.registrationform.api.domain;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class RegFormView {
	@NotEmpty
	String name;

	@NotEmpty
	String surname;

	@NotEmpty
	String email;
}
