package ru.netolodgy.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test
    public void addOneMovie() {
        PosterManager manager = new PosterManager();
        manager.addMovie("film1");
        String[] actual = manager.findAll();
        String[] expected = {"film1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addZeroMovies() {
        PosterManager manager = new PosterManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addThreeMovie() {
        PosterManager manager = new PosterManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showTheLastFiveFilms() {
        PosterManager manager = new PosterManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");
        manager.addMovie("film8");
        manager.addMovie("film9");
        String[] actual = manager.findLast();
        String[] expected = {"film9", "film8", "film7", "film6", "film5"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showTheLastSevenFilms() {
        PosterManager manager = new PosterManager(7);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");
        manager.addMovie("film8");
        manager.addMovie("film9");
        String[] actual = manager.findLast();
        String[] expected = {"film9", "film8", "film7", "film6", "film5", "film4", "film3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void latestMoviesIfThereAreNotEnoughItems() {
        PosterManager manager = new PosterManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        String[] actual = manager.findLast();
        String[] expected = {"film3", "film2", "film1"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
