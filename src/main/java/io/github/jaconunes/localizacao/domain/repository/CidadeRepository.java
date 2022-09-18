package io.github.jaconunes.localizacao.domain.repository;

import io.github.jaconunes.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    // busca pelo nome exato
    List<Cidade> findByNome(String nome);

    // busca começando pelo que for digitado
    List<Cidade> findByNomeStartingWith(String nome);

    // busca terminando pelo o que for digitado
    List<Cidade> findByNomeEndingWith(String nome);

    // busca Nomes que contenham o que for digitado
    List<Cidade> findByNomeContaining(String nome);

    List<Cidade> findByHabitantes(Long habitantes);
}
