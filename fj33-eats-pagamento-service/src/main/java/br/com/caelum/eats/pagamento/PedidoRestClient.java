package br.com.caelum.eats.pagamento;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(url = "${configuracao.pedido.service.url}", name = "pedido")
public interface PedidoRestClient {

    @PutMapping("/pedidos/{id}/pago")
    void confirmaPagamentoDoPedido(@PathVariable("id") Long pedidoId);

}