package br.com.ithappens.sitef;

import br.com.ithappens.model.cadastro.AgenteCobrador;
import br.com.ithappens.model.cadastro.Cliente;
import br.com.ithappens.model.cadastro.Empresa;
import br.com.ithappens.model.cadastro.TipoCobranca;
import br.com.ithappens.sitef.enuns.ParametroMontagem;
import lombok.Data;

@Data
public class RedeProdutoConfig {

    private final Integer PARCELADO = 2;

    private Long id;
    private Empresa empresa;
    private Integer idRede;
    private Integer idProduto;
    private Integer tipo;
    private Cliente cliente;
    private Integer ciclo;
    private Integer bandeira;
    private AgenteCobrador agenteCobrador;
    private AgenteCobrador agenteCobradorParcelado;
    private TipoCobranca tipoCobranca;
    private Integer parametroMontagem = ParametroMontagem.NSU.getValor();

    public AgenteCobrador getAgenteCobradorPorTipo(Integer qtdParcela){
        if(tipo.equals(PARCELADO) && qtdParcela > 1)
            return  this.agenteCobradorParcelado;
        else
            return this.agenteCobrador;
    }
}
