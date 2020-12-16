package br.com.ithappens.model.financeiro;


import br.com.ithappens.model.pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartaCreditoPedido {

    private Long                   id;
    private TituloPagar            tituloPagar;
    private Pedido                 pedido;
    private CartaCreditoPedidoCapa capa;
}
