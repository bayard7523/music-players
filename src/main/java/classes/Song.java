package main.java.classes;

import java.util.concurrent.atomic.AtomicInteger;

public class Song {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private Integer id;
    private String title;
    private String author;

    public Song(String title, String author) {
        this.id = getCounter();
        this.title = title;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private int getCounter() {
        return counter.getAndIncrement();
    }

    @Override
    public String toString() {
        return title + '\'' + " - " + author + '\'';
    }


}
