package org.exercise.best.controller;

import org.exercise.best.model.Movies;
import org.exercise.best.model.Songs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class BestController {

    @GetMapping
    public String homepage(Model model){
        String user = "Davide";
        model.addAttribute("name", user);
        return "homepage";
    }

    @GetMapping("/movies")
    public String moviePage(Model model){
        // recupero la lista dei film
        List<Movies> movies = getBestMovies();
        model.addAttribute("movie", movies);
        return "movies";
    }

    @GetMapping("/songs")
    public String songPage(Model model){
        // recupero la lista delle canzoni
        List<Songs> songs = getBestSongs();
        model.addAttribute("song", songs);
        return "songs";
    }

    // metodo private che restituisce una lista di oggetti di tipo Movies
    private List<Movies> getBestMovies(){
    List<Movies> movies = new ArrayList<>();
    movies.add(new Movies(1, "La Leggenda degli uomini straordinari"));
    movies.add(new Movies(2, "The Mask"));
    movies.add(new Movies(3, "Spider-Man 2"));
    movies.add(new Movies(4, "La leggenda del pianista sull'oceano"));
    return movies;
    }

    // metodo private che restituisce una lista di oggetti di tipo Songs
    private List<Songs> getBestSongs(){
        List<Songs> songs = new ArrayList<>();
        songs.add(new Songs(1,"Crown - NEFFEX"));
        songs.add(new Songs(2,"Golden Hour - JVKE " ));
        songs.add(new Songs(3,"Rise - The Glitch Mob, Mako, The World Alive" ));
        songs.add(new Songs(4, "Greenlights - Krewella"));
        return songs;
    }
}
