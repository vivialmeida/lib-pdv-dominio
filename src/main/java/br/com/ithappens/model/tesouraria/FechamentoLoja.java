package br.com.ithappens.model.tesouraria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FechamentoLoja {

    private Long id;
    private Long IdFilial;
    private LocalDateTime data;
    private Integer status;
}
