package br.com.ithappens.dto;



import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PromocaoCadastroDto {

    private String cpf;
    private LocalDateTime data;
    private String chaveNfce;
    private Long codigoCupom;
    private Integer pdv;
    private Long idFilial;
    private List<PromocaoProdutoDto> produtos;
    private Integer tipo;

    public PromocaoCadastroDto(CupomCapaDto cupomCapaDto) {
        this.cpf = cupomCapaDto.getCpfCrm();
        this.data = cupomCapaDto.getDataVenda();
        this.codigoCupom = cupomCapaDto.getCupom();
        this.chaveNfce = cupomCapaDto.getChaveNfe();
        this.pdv = cupomCapaDto.getPdv();
        this.idFilial = cupomCapaDto.getFilialId();
        this.produtos = cupomCapaDto.getCupomProdutos().stream().filter(this::isCupomSuperValido)
                .map(PromocaoProdutoDto::new).collect(Collectors.toList());
    }

    private boolean isCupomSuperValido(CupomProdutoDto cupomProdutoDto) {
        BigDecimal descontoCrm = cupomProdutoDto.getDescontoCrm();
        return !(Objects.isNull(descontoCrm) || descontoCrm.compareTo(BigDecimal.ZERO) <= 0);
    }

    @JsonProperty("data")
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getData() {
        return this.data;
    }

    @JsonIgnore
    public String getChaveNfce() {
        return chaveNfce;
    }
}
