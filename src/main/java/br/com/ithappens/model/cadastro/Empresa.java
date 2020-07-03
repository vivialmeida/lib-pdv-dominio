package br.com.ithappens.model.cadastro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {

    private Long        id;
    private String      desc;
    private BigDecimal  taxaJuros;
    private String      razaoSocial;
    private String      nomeFantasia;
    private Long        cnpj;
    private Long        inscEstadual;
    private String      endereco;
    private String      numero;
    private String      complemento;
    private String      cep;
    private String      bairro;
    private String      dddFone;
    private String      fone;
    private String      dddFax;
    private String      fax;
    private String      email;
    private Integer     regimeEmpresa;
    private String      isento;
    private Integer     idCidade;
    private Integer     efdIndNatPj;
    private Integer     efdIndAtiv;
    private Integer     efdCodIncTrib;
    private Integer     efdIndAproCred;
    private Integer     efdCodTipoCont;
    private Integer     efdIndRegCum;
    private Long        idConta;
    private String      geraContabil;
    private Long        idContaCobranca;
    private Long        idAtividade;
    private Integer     raizCnpj;
    private Integer     idSistema;
    private Long        idContaFornecedor;
    private String      icmsStNaoRetido;
    private Long        qtdArqRemessaSerasa;
    private Integer     empresaCCF;
    private Long        idBancoMateus;
    private Long        idGrupoFinanceiro;
    private LocalDateTime rowversion;
}
