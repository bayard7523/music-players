package main.java.classes;

import javafx.scene.media.Media;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public class SongFile {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private Integer id;
    private String name;
    private Media media;
    private final String path = "src\\main\\resources\\";

    public SongFile(String name) {
        this.id = getCounter();
        this.name = name;
        media = new Media(new File(path + name + ".mp3").toURI().toString());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    private int getCounter() {
        return counter.getAndIncrement();
    }

    @Override
    public String toString() {
        return id + " - " + name+".mp3";
    }
}
