package com.sena.parqueadero.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegistroEntradaDTO {

	@NotBlank(message = "La placa es obligastoria")
	private String placa;

}
