package br.com.headfirst.chapter2;

import java.util.ArrayList;
import java.util.List;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie movie_1 = new Movie();
        Movie movie_2 = new Movie();
        Movie movie_3 = new Movie();

        movie_1.title = "Harry Potter";
        movie_1.genre = "Fantasy";
        movie_1.rating = -15;

        movie_2.title = "Detona Ralph";
        movie_2.genre = "Animation";
        movie_2.rating = 9;

        movie_3.title = "Megamind";
        movie_3.genre = "Awesome";
        movie_3.rating = 10;

        List<Movie> movies = new ArrayList<Movie>();
        movies.add(movie_1);
        movies.add(movie_2);
        movies.add(movie_3);

        for (Movie movie : movies) {
            if (movie.rating >= 10) {
                movie.playIt();
            }
        }
    }
}
