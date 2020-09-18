package br.com.caelum.eats.pagamento;


import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.io.IOException;
import java.lang.reflect.Type;

@FeignClient(url = "${configuracao.pedido.service.url}", name = "pedido")
public interface PedidoRestClient {

    @PutMapping("/pedidos/{id}/pago")
    void confirmaPagamentoDoPedido(@PathVariable("id") Long pedidoId);

}



public class MeuDecoder implements Decoder {

    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        return null;
    }
}