package me.bbb.coding.votacao.bbb.api.repository;

import me.bbb.coding.votacao.bbb.api.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParametroRepository extends MongoRepository<ParametroModel, String> {

}