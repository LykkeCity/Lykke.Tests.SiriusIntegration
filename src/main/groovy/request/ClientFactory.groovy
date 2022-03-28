package request

import config.Config
import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

class ClientFactory {
    static ConfigObject config = Config.get()

    static def getClient(service, contentType) {
        def client = new RESTClient(service, contentType)

        client.handler.failure = { response, data ->
            response.setData(data)
            return response
        }

        client
    }

    static def getHftServiceClient() {
        getClient(Config.test_service_url, ContentType.JSON)
    }
}
