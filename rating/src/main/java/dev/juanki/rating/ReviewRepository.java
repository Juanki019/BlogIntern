package dev.juanki.rating;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{

}
