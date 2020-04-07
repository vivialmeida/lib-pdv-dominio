package br.com.ithappens.model.cadastro;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Conta {

    private Long        id;
    private String      desc;
    private Integer     tipoConta;
    private Integer     idAg;
    private Integer     idConta;
    private String      digitoVerificadorConta;
    private String      digitoVerificadorContaAg;
    private String      convenio;
    private Integer     idFilial;
    private Integer     ativo;
    private BigDecimal  saldo;
    private String      saldoNega;
    private BigDecimal saldoSemOp;
    private BigDecimal saldoOp;
    private Long       idFornecedor;
    private Long       idContaContabil;
    private String     carteira;
    private Long       nossoNumero;
    private String     obsCobranca1;
    private String     obsCobranca2;
    private String     obsCobranca3;
    private Long       sequencialRemessa;
    private Integer    tipoLayoutCnab;
    private String     convenioPagfor;
    private String     convenioTributos;
    private String     codigoBeneficiario;

}
