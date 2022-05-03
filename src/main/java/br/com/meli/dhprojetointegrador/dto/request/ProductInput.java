package br.com.meli.dhprojetointegrador.dto.request;

import lombok.*;
import org.springframework.format.annotation.NumberFormat;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductInput {

    @NotNull(message = "O código productId não pode ser nulo")
    @NumberFormat
    private Long productId;

    @NotNull(message = "O campo quantity não pode ser nulo")
    @NumberFormat
    private Integer quantity;

}
