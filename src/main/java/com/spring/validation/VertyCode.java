package com.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Constraint(validatedBy = CodeValidator.class) 
public @interface VertyCode {
	
	public String value() default "+20";
	public String message() default "invalid code";
	// define default groups
		public Class<?>[] groups() default {};

		// define default payloads
		public Class<? extends Payload>[] payload() default {};
}
