package br.com.ithappens.model.cartao;

import br.com.ithappens.financeiro.model.sitef.Produtos;
import br.com.ithappens.financeiro.model.sitef.Redes;
import lombok.Data;

@Data
public class CartaoCiclos {

    private Long id;
    private CartaoConfiguracao cartaoConfiguracao;
    private Produtos produtos;
    private Redes redes;
    private TipoCiclo tipoCiclo;
    private Integer ciclo;
    private Integer diaDeposito;
    private Integer diaReferencia;
    private SemanaDeposito semanaDeposito;
    private Boolean antecipDiaDeposito;
    private Integer diaRepasse;
    private Integer diaInicioPeriodo;
    private Integer diaFinalPeriodo;
}
