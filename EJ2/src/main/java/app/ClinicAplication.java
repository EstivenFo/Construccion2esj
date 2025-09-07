package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;




@SpringBootApplication
public class ClinicAplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClinicAplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Esta en función");
		
	}

}
