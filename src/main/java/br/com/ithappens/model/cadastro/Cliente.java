package br.com.ithappens.model.cadastro;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Cliente {

    private Long        id;
    private String      razaoSocial;
    private String      fantasia;
    private String      endereco;
    private String      bairro;
    private Integer     idCidade;
    private String      idUf;
    private String      cep;
    private String      ddd;
    private String      fone;
    private String      empresa;
    private String      enderecoCobrador;
    private String      cidadeCobrador;
    private String      ufCobrador;
    private String      cepCobrador;
    private LocalDate   dtNascimento;
    private String      pessoa;
    private String      cicCgc;
    private String      inscricaoEstadual;
    private LocalDate   dtCompra;
    private BigDecimal  credito;
    private BigDecimal  creditoAtual;
    private Integer     idEstado;
    private LocalDate   dtCadastro;
    private String      Observacao;
    private String      nomePai;
    private String      nomeMae;
    private Character   ativo;
    private Integer     idRamoAtivo;
    private Integer     idBairro;
    private Integer     idPais;
    private LocalDateTime dtAtualizacao;
    private String      email;
    private String      contribuinte;
    private Integer     tipoCliente;
    private String      serasaEspecial;
    private String      cepComplemento;
    private String      cepCobradorComplemento;
    private String      emailNFE;
    private Integer     categoria;
    private BigDecimal  latitude;
    private BigDecimal  longitude;
    private Integer     simplificado;
    private Integer     naoUnificaBoneto;
    private Integer     isentoTaxaBoleto;
    private BigDecimal  rg;
    private LocalDateTime rowversion;
    private String      numero;
    private String      complemento;


}
