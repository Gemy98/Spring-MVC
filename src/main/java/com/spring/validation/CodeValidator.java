package com.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CodeValidator implements ConstraintValidator<VertyCode, String> {


	private String myCode;

	@Override
	public void initialize(VertyCode code) {
		myCode = code.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		boolean res;
		if(code != null) {
			res = code.startsWith(myCode);
		} else {
			res = true;
		}
		return res;
	}

}