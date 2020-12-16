package br.com.ithappens.model.cadastro;

import lombok.Data;

@Data
public class Usuario {

    public  final  static long USUARIO_SISTEMA = 260;

    private Long id;

    public Usuario() {
    }

    public Usuario(long id) {
        this.id = id;
    }
}
