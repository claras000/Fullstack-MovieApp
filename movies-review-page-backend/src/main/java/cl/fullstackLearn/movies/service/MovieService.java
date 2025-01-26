package cl.fullstackLearn.movies.service;


import cl.fullstackLearn.movies.models.Movie;
import cl.fullstackLearn.movies.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
    return movieRepository.findAll(); //mongoRepo
    }

    public Optional<Movie> singleMovie(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> singleMovieById(String imdId) {return movieRepository.findMovieByimdbId(imdId); }

    public List<Movie> moviesByGenre(String genre) {return movieRepository.findByGenresContaining(genre);}
}
