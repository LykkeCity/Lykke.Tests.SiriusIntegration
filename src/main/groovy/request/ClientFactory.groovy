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
        getClient(config.http.service, ContentType.JSON)
    }

    static def getRoutesConfigV4Client(contentType = ContentType.JSON) {
        getClient(config.http.routesConfigV4Service, contentType)
    }
}
