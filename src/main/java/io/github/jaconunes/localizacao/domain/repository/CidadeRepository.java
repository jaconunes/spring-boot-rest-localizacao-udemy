package io.github.jaconunes.localizacao.domain.repository;

import io.github.jaconunes.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}