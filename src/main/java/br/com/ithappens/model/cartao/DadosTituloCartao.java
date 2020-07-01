package br.com.ithappens.model.cartao;

import br.com.ithappens.model.cadastro.AgenteCobrador;
import br.com.ithappens.model.cadastro.Cliente;
import br.com.ithappens.model.cadastro.Fornecedor;
import br.com.ithappens.model.cadastro.TipoCobranca;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DadosTituloCartao {

    private Long                id;
    private CartaoConfiguracao  cartaoConfiguracao;
    private Fornecedor fornecedor;
    private Cliente             cliente;
    private AgenteCobrador      agenteCobrador;
    private TipoCobranca tipoCobranca;
    private Integer             tipo;
    private BigDecimal          taxaComissaoVarejo  = BigDecimal.ZERO;
    private BigDecimal          taxaComissaoAtacado = BigDecimal.ZERO;
    private Integer             cicloVencimento;
}
