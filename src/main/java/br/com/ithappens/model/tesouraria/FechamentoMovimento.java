package br.com.ithappens.model.tesouraria;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class FechamentoMovimento {

        private Long filialId;
        private Long fechamentoLojaId;
        private Long id;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        private LocalDate  dataMovimento;
        private BigDecimal valorVenda;
        private BigDecimal valorApurado;
        private BigDecimal valorDesconto;
        private BigDecimal valorRecebimento;
        private BigDecimal valorCancelamento;
        private BigDecimal valorVendaBruta;
        private BigDecimal vendaLiquida;
        private Integer pdv;
}
