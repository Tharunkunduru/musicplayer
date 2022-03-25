package com.musicplayer;


import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist meditation = new Playlist("meditation");
        meditation.addSong("Calm","4:00");
        meditation.addSong(new Song("Om","3:10"));
        meditation.next();
        System.out.println(meditation.getPointer());
    }
}
