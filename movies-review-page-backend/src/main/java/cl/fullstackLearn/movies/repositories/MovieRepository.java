package cl.fullstackLearn.movies.repositories;

import cl.fullstackLearn.movies.models.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository for Database Connection for Movies
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByimdbId(String imdId);

    List<Movie> findByGenresContaining(String genre);
}
