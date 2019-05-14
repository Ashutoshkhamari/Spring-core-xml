package com.stackroute.spring.beans;

public class Movie {
    private String movieName;
    private String actorName;
    private String genre;

    public Movie()
    {

    }
    public Movie(String movieName, String actorName, String genre) {
        this.movieName = movieName;
        this.actorName = actorName;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String welcomeMessage()
    {
        return "welcome...";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

