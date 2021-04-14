package main.java.classes;

import main.java.interfaces.IPlayer;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MusicPlayer implements IPlayer {

    private final Logger logger = Logger.getLogger(MusicPlayer.class.getName());
    private final LinkedList<Song> allMusic = new LinkedList<>();

    public MusicPlayer() {
        allMusic.add(new Song("Sweet Child O' Mine", "Guns N' Roses"));
        allMusic.add(new Song("Thunderstruck", "AC/DC"));
        allMusic.add(new Song("Hells Bells", "AC/DC"));
    }

    @Override
    public void showAll() {
        sortAll(allMusic).forEach(song -> System.out.println(allMusic.indexOf(song) + " - " + song.toString()));
    }

    @Override
    public void play(Integer id) {
        Song song = getSong(id);
        if (song != null) {
            System.out.println("Playing: " + song.toString());
        }
    }

    @Override
    public void add(String title, String author) {
        allMusic.add(new Song(title, author));
    }

    @Override
    public void delete(Integer id) {
        Song song = getSong(id);
        allMusic.remove(song);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(allMusic);
    }

    @Override
    public void playNextOrPrevious() {

    }

    private Song getSong(Integer id) {
        try {
            return allMusic.get(id);
        } catch (IndexOutOfBoundsException exception) {
            logger.warning("Incorrect id: " + exception.getMessage());
            return null;
        }
    }

    private List<Song> sortAll(List<Song> allMusic) {
        return allMusic.stream().sorted(Comparator.comparingInt(Song::getId)).collect(Collectors.toList());
    }


}
