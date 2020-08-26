package br.com.ithappens.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoComDescontoCPFDto {

    private String cpfCnpj;
    private BigDecimal qtdeMaxima;
    private Integer tipoDesconto;
    private BigDecimal valor;
    private Long idProduto;

}
