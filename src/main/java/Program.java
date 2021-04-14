package main.java;

import main.java.classes.MusicPlayer;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        MusicPlayer player= new MusicPlayer();
        player.showAll();
        player.play(1);
        player.add("Пачка Сигарет", "Кино");

        player.showAll();
        player.play(3);

        player.delete(2);
        player.showAll();

        player.shuffle();
        player.showAll();



    }
}
