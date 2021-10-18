package com.registrationform.api.mapper;

import com.registrationform.api.domain.CreateRegFromDto;
import com.registrationform.api.domain.RegForm;
import com.registrationform.api.domain.RegFormView;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-18T03:45:35+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15 (Oracle Corporation)"
)
@Component
public class RegFormMapperImpl extends RegFormMapper {

    @Override
    public RegForm getRegFormFromCreateRegFormDto(CreateRegFromDto dto) {
        if ( dto == null ) {
            return null;
        }

        RegForm regForm = new RegForm();

        regForm.setName( dto.getName() );
        regForm.setSurname( dto.getSurname() );
        regForm.setEmail( dto.getEmail() );
        regForm.setPassword( dto.getPassword() );

        return regForm;
    }

    @Override
    public RegFormView getRegFromViewFromRegForm(RegForm form) {
        if ( form == null ) {
            return null;
        }

        RegFormView regFormView = new RegFormView();

        regFormView.setName( form.getName() );
        regFormView.setSurname( form.getSurname() );
        regFormView.setEmail( form.getEmail() );

        return regFormView;
    }
}
