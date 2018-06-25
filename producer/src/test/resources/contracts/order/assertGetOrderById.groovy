package contracts.order

import org.springframework.cloud.contract.spec.Contract

/**
 * Contract definition, written in a Groovy DSL
 */
Contract.make {

    /**
     * Request which completes with HTTP statusCode 200
     */
    request {
        method 'GET'
        url('/orders/1')
        headers {
            accept("application/json")
        }
    }
    response {
        status 200
        body([
                "id": 1
        ])
        headers {
            contentType(applicationJson())
        }
    }
}