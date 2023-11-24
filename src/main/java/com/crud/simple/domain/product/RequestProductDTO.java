package com.crud.simple.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProductDTO(Long id,
                                @NotBlank String name,
                                @NotBlank String description,
                                @NotNull Double price) {
}
