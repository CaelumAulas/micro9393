package contracts.restaurantes

import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "deve não adicionar novo restaurante pois o tipo de cozinha é inválido"
    request{
        method POST()
        url("/restaurantes")
        body([
                id: 5,
                cep: '71500-000',
                tipoDeCozinhaId: 2
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status 400
        body([
                type: "cozinha-invalida",
                documentation: 'http://....',
                tipoDeCozinhaId: 1
        ])
        headers {
            contentType('application/json')
        }
    }
}
