package br.com.ithappens.model.cadastro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Filial {

    private Long    id;
    private String  desc;
    private String  sigla;
    private Integer tipoSegmento;
    private Long    cnpj;
    private Long    inscEsta;
    private Long    numeSequFatura;
    private Integer idEmpresa;
    private String  ativo;
    private Long    idClasse;
    private Integer idCidade;
    private String  endereco;
    private String numero;
    private String complemento;
    private Long   idBairro;
    private String razaoSocial;
    private String nomeFantasia;
    private String bairro;
    private String dddFone;
    private String fone;
    private String dddFax;
    private String fax;
    private String email;
    private String cep;
    private Long   idCliente;
    private Long   idFornecedor;
    private Integer autorizacaoEletronica;
    private String  sequencialNfe;
    private Integer idBanco;
    private String  serieNfe;
    private String  retencaoImposto;
    private Long    idForcecedorMunicipal;
    private String  permiteDownloadXmlNfe;
    private String  nfeOBrigatorio;
    private Long    idContabilista;
    private Long    idFilialMatriz;
    private Integer filialContabil;
    private Long    numeroReprogramacao;
    private Long    idConta;
    private LocalDateTime dtAtualizacao;
    private Integer tipoLoja;
    private String  balancaRodoviaria;
    private Long    idRegional;
    private Long    idTipoOperacao;
    private Long    idRotaPadrao;
    private Integer idCentralCompra;
    private String  importaCupom;
    private String  usaBalanca;
    private String  descReduzida;
    private Integer rowversion;
}
