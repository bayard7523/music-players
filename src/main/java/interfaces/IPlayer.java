package main.java.interfaces;

public interface IPlayer {

    void showAll();

    void play(Integer id);

    void add(String title,String author);

    void delete(Integer id);

    void shuffle();

    void playNextOrPrevious();
}
