package br.com.Alura.linguagensDaAlura;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LInguagemRepository extends MongoRepository<Linguagem, String> {
    
}
