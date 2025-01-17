package br.com.fiap.soat8.grp14.techchallenge.adapters.in.web.util;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class StandardValidationError extends StandardError {
    private List<ValidationError> errorList;
}
