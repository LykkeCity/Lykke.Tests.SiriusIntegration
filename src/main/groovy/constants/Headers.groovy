package constants

import groovyx.net.http.ContentType

class Headers {
    static def getContentType() {
        ['Content-Type': ContentType.URLENC]
    }

    static def getInvalidContentType() {
        ['Content-Type': 'dkfmrdfooi']
    }

    static def getAuth() {
        ['Authorization': "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6ImRhcyIsImF1ZCI6ImhmdC5seWtrZS5jb20iLCJrZXktaWQiOiI0ODZjYjlhZi1hOTBlLTQ2YTUtOTk0Ny1lMzI0MTZjYzQ1MTciLCJjbGllbnQtaWQiOiI5YjY4NDJjNC1mNWU1LTRjZDAtOTE5Mi1mZTMzMDk0ZTFkYzMiLCJ3YWxsZXQtaWQiOiIyYTAxNjRlMC1hMjc4LTRlNmUtYjQ2NC05YTU2MGMwMTYwMTAiLCJhcGl2Mk9ubHkiOiJGYWxzZSIsIm5iZiI6MTY0ODIxMTMzMiwiZXhwIjoxOTYzODMwNTMyLCJpYXQiOjE2NDgyMTEzMzJ9.468Ysv2bohALJ0grrvvHrj0ex3mEXe8mb8kEsezfKP4"]
    }
}
