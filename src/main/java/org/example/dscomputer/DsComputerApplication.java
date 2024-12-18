package org.example.dscomputer;

import org.example.dscomputer.dao.entities.Computer;
import org.example.dscomputer.dto.ComputerDTO;
import org.example.dscomputer.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DsComputerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsComputerApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ComputerService computerService) {
		return args -> {

			ComputerDTO computer1 = ComputerDTO.builder().proce("i5").ram("16G").hardDrive("ggg").price("4200dh").macAddress("add 12546").build();
			ComputerDTO computer2 = ComputerDTO.builder().proce("i7").ram("8G").hardDrive("ooo").price("1500dh").macAddress("add 5487").build();
			ComputerDTO computer3 = ComputerDTO.builder().proce("i3").ram("16G").hardDrive("ppp").price("1200dh").macAddress("add 547").build();
			ComputerDTO computer4 = ComputerDTO.builder().proce("i5").ram("22G").hardDrive("ppp").price("18000dh").macAddress("add 89").build();

			computerService.saveComputer(computer1);
			computerService.saveComputer(computer2);
			computerService.saveComputer(computer3);
			computerService.saveComputer(computer4);

		};


	}
}
