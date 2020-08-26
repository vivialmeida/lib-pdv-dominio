package br.com.ithappens.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CupomFinalizadoraDto {

    private Long id;
    private CupomCapaDto cupomCapa;
    private Integer sequencia;
    private Integer finalizadora;
    private Integer bandeira;
    private BigDecimal valor;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataVencimento;
    private Integer parcelas;
    private Integer dominio;
    private String cpfCnpj;
    private Long comp;
    private Long codBanco;
    private Long agencia;
    private Long conta;
    private Long numeroCheque;
    private String cartao;
    private Long nsuSitef;
    private Long nsuHost;
    private String produtoTef;
    private String codigoAutorizacao;
    private String nossoNumero;

    public BigDecimal getValor() {
        if(valor == null) {
            return BigDecimal.ZERO;
        }
        return valor.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
