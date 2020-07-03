package br.com.ithappens.model.cartao;


import br.com.ithappens.sitef.Produto;
import br.com.ithappens.sitef.Rede;
import lombok.Data;

@Data
public class CartaoCiclos {

    private Long id;
    private CartaoConfiguracao cartaoConfiguracao;
    private Produto produtos;
    private Rede redes;
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
