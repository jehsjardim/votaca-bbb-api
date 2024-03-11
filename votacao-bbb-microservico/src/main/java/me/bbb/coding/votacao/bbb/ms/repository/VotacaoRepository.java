package me.bbb.coding.votacao.bbb.ms.repository;

import me.bbb.coding.votacao.bbb.ms.model.VotacaoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VotacaoRepository extends MongoRepository<VotacaoModel, String> {
}