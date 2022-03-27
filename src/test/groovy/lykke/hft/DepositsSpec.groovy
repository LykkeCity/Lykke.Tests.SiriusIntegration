package lykke.hft


import constants.Headers
import constants.AssetIds
import groovyx.net.http.RESTClient
import request.ClientFactory
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll
import request.URIBuilder



class DepositsSpec extends Specification {
    @Shared
    RESTClient httpClient = ClientFactory.hftServiceClient



    def "Check address generation endpoint"() {


        when: "Send request"
        def response = httpClient.post(path: URIBuilder.DEPOSITS, headers: Headers.auth)

        then: "Validate response status code"
        assert response.status == 200

    }

    def "Check deposit addresses after generation, count and networks"() {

        when: "Send request"
        def response = httpClient.get(path: URIBuilder.DEPOSITS, headers: Headers.auth)

        then: "Validate response status code"
        assert response.status == 200

        and: "Validate items quantity"
        assert response.data.size() == 11

    }


    @Unroll
    def "Check single asset address for #assetid"() {
        setup: "setup path"
        def assetpath=URIBuilder.DEPOSITS+'/'+assetid

        when: "Send request"
        def response = httpClient.get(path: assetpath, headers: Headers.auth )

        then: "Validate response status code"
        assert response.status == 200

        and: "Validate response size"
        assert response.data.size() == size
        and: "Validate assetid"
        assert response.data.assetId == assetid
        and: "Validate address state"
        assert response.data.state == "Active"

        where:
        assetid            | size
        AssetIds.ADA       | 6
        AssetIds.ALGO      | 6
        AssetIds.BNB       | 6
        AssetIds.BTC       | 6
        AssetIds.ETH       | 6
        AssetIds.ETC       | 6
        AssetIds.MATIC     | 6
        AssetIds.SCT0      | 6
        AssetIds.WND       | 6
        AssetIds.XLM       | 6
        AssetIds.XTZ       | 6
        AssetIds.DOGE      | 6
    }


}
