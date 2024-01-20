package zti.zti_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The main class that starts the backend side of application.
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class ZtiProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZtiProjectApplication.class, args);
	}
}
