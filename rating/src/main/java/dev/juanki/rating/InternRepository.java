package dev.juanki.rating;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // this is the annotation for the repository
public interface InternRepository extends MongoRepository<Intern, ObjectId> {

    Optional<Intern> findByImdbId(String imdbId);
}