package com.MovieReview.MovieReview;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class movieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movies>> getAllMovies(){
        return new ResponseEntity<List<Movies>>(movieService.AllMovies(),HttpStatus.OK);

    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movies>> getSingle(@PathVariable String imdbId){
       return new ResponseEntity<Optional<Movies>>(movieService.getsingle(imdbId),HttpStatus.OK);

    }


}
