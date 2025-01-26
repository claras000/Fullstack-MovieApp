package cl.fullstackLearn.movies.repositories;

import cl.fullstackLearn.movies.models.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * Repository for Database Connection for Reviews
 *
 */
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
