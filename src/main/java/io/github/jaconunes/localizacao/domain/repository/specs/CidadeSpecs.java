package io.github.jaconunes.localizacao.domain.repository.specs;

import io.github.jaconunes.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.domain.Specification;

public class CidadeSpecs {

    public static Specification<Cidade> habitantesBetween(Long min, Long max){
        return ((root, query, cb) -> cb.between( root.get("habitantes"), min, max ));
    }
}
