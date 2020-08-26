package br.com.ithappens.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CupomServicoDto {
    private Long id;
    private CupomCapaDto cupomCapa;
    private Integer sequencia;
    private Long tipoUso;
    private Long referencia;
    private Long documento;
    private String nsuhost;
    private String autorizacao;
    private BigDecimal valor;
}
