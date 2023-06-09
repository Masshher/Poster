package ru.netolodgy.poster;

public class PosterManager {

    private String[] films = new  String[0];
    private int limit;
    public PosterManager() {
        this.limit = 5;
    }
    public PosterManager(int limit) {
        this.limit = limit;
    }
    public void addMovie(String film) {
        String[] tmp =new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }
    public String[] findAll() {
        return films;
    }
    public String[] findLast() {
        int posterLength;
        if (films.length < limit) {
            posterLength = films.length;
        } else {
            posterLength = limit;
        }
        String[] tmp = new String[posterLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}