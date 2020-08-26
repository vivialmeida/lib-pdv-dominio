package br.com.ithappens.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"id"})
public class CupomCapaDto {
    private Long id;
    private Long filialId;
    private Integer pdv;
    private Long cupom;
    private LocalDateTime dataMovimento;
    private Long codOperador = 0L;
    private String nomeOperador;
    private String cpfOperador;
    private Integer situacao;
    private Boolean cancelado;
    private Integer tipoUso;
    private Integer operadorMovimento;
    private BigDecimal valorTotal;
    private BigDecimal descontoTotal;
    private BigDecimal acrescimoTotal;
    private BigDecimal valorFaturado;
    private BigDecimal limiteUsado;
    private BigDecimal troco;
    private Integer trocoFinalizadora;
    private Integer qtdeItens;
    private Integer qtdeServicos;
    private Integer qtdeFinalizadoras;
    private String chaveNfe;
    private String chaveNfex;
    private Long codVendedor    = 0L;
    private Long pedidoFaturado = 0L;
    private String cpfOuCnpjCliente = "";
    private List<CupomFinalizadoraDto> cupomFinalizadoras;
    private List<CupomServicoDto> cupomServicos;
    private List<CupomProdutoDto> cupomProdutos;
    private Boolean enviadoEstoque;
    private Boolean enviadoFinanceiro;
    private Boolean enviadoCrm;
    private LocalDateTime dataVenda;
    private String cpfCrm = "";

}