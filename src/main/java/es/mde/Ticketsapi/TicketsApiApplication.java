package es.mde.Ticketsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:config/jpa-config.xml" })
@Import(ConfiguracionPorJava.class)
public class TicketsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketsApiApplication.class, args);
	}

}
