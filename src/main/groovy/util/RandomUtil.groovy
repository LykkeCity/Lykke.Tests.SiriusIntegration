package util

import java.security.SecureRandom
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

class RandomUtil {
    static final NUMBERS = '0'..'9'
    static final LETTERS = ('a'..'z') + ('A'..'Z')

    static String generate(range, int length) {
        def random = new SecureRandom()
        def size = range.size()

        return (1..length).collect { range[random.nextInt(size)] }.join()
    }

    static int generateNumber(int length, boolean isSkipLeadingNil = true) {
        def number = generate(NUMBERS, length)

        if (isSkipLeadingNil && number.startsWith('0')) {
            number = generateNumber(length, isSkipLeadingNil)
        }

        number.toInteger()
    }

    static String generateLetters(int length) {
        generate(LETTERS, length)
    }

    static def getGuid() {
        UUID.randomUUID().toString()
    }

    static def getTestGuid() {
        'lykke-test-' + guid
    }
}
