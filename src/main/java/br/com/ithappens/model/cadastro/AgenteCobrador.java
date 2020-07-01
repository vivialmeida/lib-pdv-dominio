package br.com.ithappens.model.cadastro;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgenteCobrador {

    private Long          id;
    private String        descricao;
    private String        fantasia;
    private Integer       tipo;
    private String        ativo;
    private LocalDateTime dtAlteracao;

}
