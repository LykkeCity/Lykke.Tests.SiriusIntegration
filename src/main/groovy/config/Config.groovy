package config

class Config {
    static String env
    static String hft_bearer
    static String test_service_url
    static ConfigObject config

    static {
        env = System.getProperty('env') ?: System.getenv('env') ?: 'test'
        hft_bearer = System.getProperty('hft_bearer') ?: System.getenv('hft_bearer')
        test_service_url = System.getProperty('test_service_url') ?: System.getenv('test_service_url')
        def resource = Config.class.getResource('/config.groovy')
        config = new ConfigSlurper(env).parse(resource)
    }
    /**
     * Returns environment specific configuration
     */
    static ConfigObject get() {
        return config
    }
}
