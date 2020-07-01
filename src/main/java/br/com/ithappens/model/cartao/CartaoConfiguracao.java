package br.com.ithappens.model.cartao;

import br.com.ithappens.financeiro.model.cadastro.Cliente;
import br.com.ithappens.financeiro.model.cadastro.Empresa;
import lombok.Data;

@Data
public class CartaoConfiguracao {

    private Long id;
    private Empresa empresa;
    private Cliente cliente;
    private Integer tipoRound;
}
