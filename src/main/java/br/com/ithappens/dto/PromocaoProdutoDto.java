package br.com.ithappens.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PromocaoProdutoDto {

    private Long codigo;
    private BigDecimal qtde;
    private Integer sequencia;

    public PromocaoProdutoDto(CupomProdutoDto cupomProdutoDto) {
        this.codigo = cupomProdutoDto.getCodigoInterno();
        this.qtde = cupomProdutoDto.getQuantidade();
        this.sequencia = cupomProdutoDto.getSequencia();
    }

    public PromocaoProdutoDto(Long codigo, BigDecimal qtde) {
        this.codigo = codigo;
        this.qtde = qtde;
    }

    @JsonIgnore
    public Integer getSequencia() {
        return sequencia;
    }
}
