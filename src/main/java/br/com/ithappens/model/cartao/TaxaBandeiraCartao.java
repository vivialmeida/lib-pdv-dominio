package br.com.ithappens.model.cartao;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TaxaBandeiraCartao {

    private Long                id;
    private DadosTituloCartao   dadosTituloCartao;
    private Integer             codigoBandeira;
    private BigDecimal          taxaComissaoVarejo  = BigDecimal.ZERO;
    private BigDecimal          taxaComissaoAtacado = BigDecimal.ZERO;
    private Integer             quantidadeParcelas;

}
