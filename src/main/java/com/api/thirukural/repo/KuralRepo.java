package com.api.thirukural.repo;

import com.api.thirukural.model.Kural;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KuralRepo extends MongoRepository<Kural,Integer> {
   public Kural findByNumber(int number);
}
