package lykke.hft


import constants.Headers
import constants.AssetIds
import groovyx.net.http.RESTClient
import request.ClientFactory
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll
import request.URIBuilder



class WithdrawalsSpec extends Specification {
    @Shared
    RESTClient httpClient = ClientFactory.hftServiceClient



    def "Check withdrawals TBD"() {
        setup: "setup withdrawal body TBD"


        when: "Send request"
        def response = httpClient.post(path: URIBuilder.WITHDRAWALS, headers: Headers.auth)

        then: "Validate response status code"
        assert response.status == 200

    }



}