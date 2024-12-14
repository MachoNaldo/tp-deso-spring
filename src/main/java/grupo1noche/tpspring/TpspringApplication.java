package grupo1noche.tpspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("grupo1noche.tpspring.repository")
public class TpspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpspringApplication.class, args);
	}

}
