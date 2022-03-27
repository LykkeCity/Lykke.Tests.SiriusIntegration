package lykke.hft


import constants.Headers
import constants.AssetIds
import groovyx.net.http.RESTClient
import request.ClientFactory
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll
import request.URIBuilder



class OperationsSpec extends Specification {
    @Shared
    RESTClient httpClient = ClientFactory.hftServiceClient



    def "TBD1"() {


        when: "Send request"
        def response = httpClient.post(path: URIBuilder.OPERATIONS, headers: Headers.auth)

        then: "Validate response status code"
        assert response.status == 200

    }

    def "TBD"() {

        when: "Send request"
        def response = httpClient.get(path: URIBuilder.OPERATIONS, headers: Headers.auth)

        then: "Validate response status code"
        assert response.status == 200

        and: "TBD"
        assert response.data.size() == 11

    }


}