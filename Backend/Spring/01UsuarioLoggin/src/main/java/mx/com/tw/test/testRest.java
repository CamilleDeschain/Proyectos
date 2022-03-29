package mx.com.tw.test;

import mx.com.tw.dao.PersonaDao;
import mx.com.tw.domain.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class testRest {

    private static final Logger log = LoggerFactory.getLogger(testRest.class);

    @Bean
    CommandLineRunner initDatabase(PersonaDao repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Persona("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Persona("Frodo Baggins", "thief")));
        };
    }
}
