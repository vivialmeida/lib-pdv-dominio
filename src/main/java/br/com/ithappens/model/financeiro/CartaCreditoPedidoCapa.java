package br.com.ithappens.model.financeiro;

import br.com.ithappens.model.cadastro.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartaCreditoPedidoCapa {

    private Long id;
    private LocalDate data;
    private Usuario usuario;
    private Integer status;
}
