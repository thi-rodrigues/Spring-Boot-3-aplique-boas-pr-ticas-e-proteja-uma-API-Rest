package med.voll.api.domain.record;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EnderecoRecord(
		
		@NotBlank
		String logradouro,
		
		@NotBlank
		String bairro, 
		
		@NotBlank
		@Pattern(regexp = "\\d{8}")
		String cep,
		
		@NotBlank
		String cidade,
		
		@NotBlank
		String uf, 
		
		String complemento, 
		
		String numero
	) {
}
