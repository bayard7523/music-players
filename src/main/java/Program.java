package main.java;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import main.java.classes.MusicPlayerWithSong;
import main.java.classes.MusicPlayerWithoutSong;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        MusicPlayerWithSong player= new MusicPlayerWithSong();
        player.showAll();
        player.add("nothing");
        player.add("thunderstruck");
        player.showAll();
        player.play(0);
        player.stop();
        player.play(1);
        player.stop();
        player.play(12);
        player.delete(0);
        player.shuffle();
        player.showAll();

//        MusicPlayerWithoutSong player = new MusicPlayerWithoutSong();
//        player.showAll();
//        player.play(0);
//        player.shuffle();
//        player.showAll();
//        player.delete(0);
//        player.showAll();
//        player.sort();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }


    static {
        JFXPanel jfxPanel = new JFXPanel();
    }
}
