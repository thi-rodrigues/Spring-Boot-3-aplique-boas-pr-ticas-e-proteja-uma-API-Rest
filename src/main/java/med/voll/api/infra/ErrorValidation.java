package med.voll.api.infra;

import org.springframework.validation.FieldError;

public record ErrorValidation(String field, String message) {
	
	public ErrorValidation(FieldError fieldError) {
		this(fieldError.getField(), fieldError.getDefaultMessage());
	}
}
