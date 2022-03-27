package config

class Config {
    static String env
    static ConfigObject config

    static {
        env = System.getProperty('env') ?: System.getenv('env') ?: 'test'

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
