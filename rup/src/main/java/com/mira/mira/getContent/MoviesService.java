package com.mira.mira.getContent;

import java.io.IOException;
import java.util.ArrayList;

public interface MoviesService {
    public ArrayList<Movie> search(String query, int page) throws IOException, InterruptedException;
    public ArrayList<Movie> discoverByGenres(ArrayList<String> genres, int page) throws IOException, InterruptedException;
    public ArrayList<Movie> getPopular(int page, String region) throws IOException, InterruptedException;
}
