package cl.fullstackLearn.movies.controllers;


import cl.fullstackLearn.movies.service.MovieService;
import cl.fullstackLearn.movies.models.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller for handling movies
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id), HttpStatus.OK);
    }

    @GetMapping("/id/{imdId}")
    public ResponseEntity<Optional<Movie>> getSingleMovieById(@PathVariable String imdId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovieById(imdId), HttpStatus.OK);
    }

    @GetMapping("/genre/{genre}")
    public ResponseEntity<List<Movie>> getMoviesByGenre(@PathVariable String genre){
        return new ResponseEntity<List<Movie>>(movieService.moviesByGenre(genre), HttpStatus.OK);
    }


}
