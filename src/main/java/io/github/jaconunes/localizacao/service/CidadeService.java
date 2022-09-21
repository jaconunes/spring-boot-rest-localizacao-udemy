package io.github.jaconunes.localizacao.service;

import io.github.jaconunes.localizacao.domain.repository.CidadeRepository;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    private CidadeRepository cidadeRepository;

    public CidadeService(CidadeRepository repository){
        this.cidadeRepository = repository;
    }

    public void listarCidadesPorQuantidadeHabitantes(){
        cidadeRepository.findByHabitantesGreaterThan(1000001L).forEach(System.out::println);
    }

    public void listarCidadesPorNome(){
        cidadeRepository.findByNomeContaining("a").forEach(System.out::println);
    }

    public void listarCidadesPorHabitantes(){
        cidadeRepository.findByHabitantes(78787900L).forEach(System.out::println);
    }


    public void listarCidades(){
        cidadeRepository.findAll().forEach(System.out::println);
    }

}
