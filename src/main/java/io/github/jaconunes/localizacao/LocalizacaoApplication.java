package io.github.jaconunes.localizacao;

import io.github.jaconunes.localizacao.domain.entity.Cidade;
import io.github.jaconunes.localizacao.domain.repository.CidadeRepository;
import io.github.jaconunes.localizacao.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

	@Autowired
	private CidadeService cidadeService;

	@Override
	public void run(String... args) throws Exception {
		cidadeService.listarCidadesPorQuantidadeHabitantes();

	}



	public static void main(String[] args) {
		SpringApplication.run(LocalizacaoApplication.class, args);
	}

}
