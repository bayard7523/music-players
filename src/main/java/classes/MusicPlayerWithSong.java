package main.java.classes;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import main.java.interfaces.IPlayer;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class MusicPlayerWithSong {
    private final Logger logger = Logger.getLogger(MusicPlayerWithoutSong.class.getName());
    private final List<SongFile> allMusic = new ArrayList<>();
    private MediaPlayer player;
    private String currentSong;

    public MusicPlayerWithSong() {
    }

    public void showAll() {
        if (allMusic.isEmpty()) {
            System.out.println("Playlist is empty. Please add songs");
        }
        allMusic.forEach(song -> System.out.println(allMusic.indexOf(song) + " - " + song.getName()));
    }

    public void add(String name) {
        allMusic.add(new SongFile(name));
    }

    public void play(Integer id) {
        if (allMusic.isEmpty()) {
            System.out.println("Playlist is empty. Please add songs");
        }
        if (checkArrayList(id)) {
            SongFile song = allMusic.get(id);
            currentSong = song.getName();
            player = new MediaPlayer(song.getMedia());
            System.out.println("Playing " + song.toString());
            player.play();
        }
    }

    public void stop() {
        player.stop();
    }

    public void delete(Integer id) {
        if (checkArrayList(id)) {
            allMusic.remove(allMusic.get(id));
        }
    }

    public void deleteAll() {
        if (allMusic.isEmpty()) {
            System.out.println("Playlist is empty");
        }
        allMusic.clear();
    }

    public void shuffle() {
        Collections.shuffle(allMusic);
    }

    private boolean checkArrayList(Integer id) {
        try {
            return allMusic.get(id) != null;
        } catch (IndexOutOfBoundsException exception) {
            logger.warning("Incorrect id: " + exception.getMessage());
            return false;
        }
    }

}
