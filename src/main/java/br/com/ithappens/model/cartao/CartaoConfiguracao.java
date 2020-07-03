package br.com.ithappens.model.cartao;

import br.com.ithappens.model.cadastro.Cliente;
import br.com.ithappens.model.cadastro.Empresa;
import lombok.Data;

@Data
public class CartaoConfiguracao {

    private Long id;
    private Empresa empresa;
    private Cliente cliente;
    private Integer tipoRound;
}
