package com.cybertek.controller;

import com.cybertek.entity.Genre;
import com.cybertek.entity.MovieCinema;
import com.cybertek.repository.GenreRepository;
import com.cybertek.repository.MovieCinemaRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WebFluxController {

    private WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080").build();

    private final MovieCinemaRepository movieCinemaRepository;
    private final GenreRepository genreRepository;

    public WebFluxController(MovieCinemaRepository movieCinemaRepository, GenreRepository genreRepository) {
        this.movieCinemaRepository = movieCinemaRepository;
        this.genreRepository = genreRepository;
    }

    @GetMapping("/flux-movie-cinemas")
    public Flux<MovieCinema> readAllCinemaFlux(){
        return Flux.fromIterable(movieCinemaRepository.findAll());
    }

    @GetMapping("/mono-movie-cinema/{id}")
    public Mono<MovieCinema> readCinemaByIdMonoPathVariable(@PathVariable("id") Long id){
        return Mono.just(movieCinemaRepository.findById(id).get());
    }

    @GetMapping("/mono-movie-cinema")
    public Mono<MovieCinema> readCinemaByIdMonoRequestParam(@RequestParam("id") Long id){
        return Mono.just(movieCinemaRepository.findById(id).get());
    }

    @PostMapping("/create-genre")
    public Mono<Genre> createGenre(@RequestBody Genre genre){
        return Mono.just(genreRepository.save(genre));
    }

    @PutMapping("/update-genre")
    public Mono<Genre> updateGenre(@RequestBody Genre genre){
        Genre updatedGenre = genreRepository.save(genre);
        return Mono.just(updatedGenre);
    }

    @DeleteMapping("/delete-genre-{id}")
    public Mono<Void> deleteGenre(@PathVariable("id") Long id){
        genreRepository.deleteById(id);
        return Mono.empty();
    }

    //------------------- WEBCLIENT EXAMPLE -------------------//

    @GetMapping("/flux")
    public Flux<MovieCinema> readWithWebClient(){
        return webClient
                .get()
                .uri("/flux-movie-cinemas")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToFlux(MovieCinema.class);
    }

    @GetMapping("/mono/{id}")
    public Mono<MovieCinema> readMovieCinemaMonoWithWebClient(@PathVariable("id") Long id){
        return webClient
                .get()
                .uri("/mono-movie-cinema/{id}", id)
                .retrieve()
                .bodyToMono(MovieCinema.class);
    }

    @GetMapping("/mono-rp")
    public Mono<MovieCinema> readMovieCinemaMonoWithWebClientRequestParam(@RequestParam("id") Long id){
        return webClient
                .get()
                .uri(uriBuilder ->
                        uriBuilder.path("/mono-movie-cinema")
                        .queryParam("id", id)
                        .build()
                )
                .retrieve().bodyToMono(MovieCinema.class);
    }

}
