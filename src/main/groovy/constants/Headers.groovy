package constants

import groovyx.net.http.ContentType
import config.Config

class Headers {
    static def getContentType() {
        ['Content-Type': ContentType.URLENC]
    }

    static def getAuth() {
        ['Authorization': Config.hft_bearer]
    }
}
