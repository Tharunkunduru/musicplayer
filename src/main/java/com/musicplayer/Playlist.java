package com.musicplayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Playlist {
    private String name;
    private int totalSongs;
    private List<Song> songs;
    private int pointer;
    Playlist(String name){
        this.name = name;
        songs = new ArrayList<>();
        pointer = 0;
        totalSongs = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSongs() {
        return totalSongs;
    }

    public void setTotalSongs(int totalSongs) {
        this.totalSongs = totalSongs;
    }

    public int getPointer() {
        return pointer;
    }
    public List<Song> showPlayList(){
        return songs;
    }
    public void playSongNo(int pointer) {
        if(pointer < 0) System.out.println("You should enter a positive number");
        if(pointer > totalSongs) System.out.println("song number should be less than "+ this.totalSongs);
        else this.pointer = pointer;
    }

    public void previous(){
        if(pointer > 0) this.pointer--;
        else System.out.println("You are playing first song...");
    }

    public void next(){
        if(totalSongs > pointer) this.pointer++;
        else System.out.println("You are playing last song...");
    }

    public void addSong(String song,String duration){
        Song dummy = new Song(song,duration);
        addSong(dummy);
    }
    public void addSong(Song song){
        this.songs.add(0,song);
        this.totalSongs++;
    }

    public void removeSong(String song){
        removeSong(new Song(song,"0"));
    }

    public void showCurrentSong(){
        if(totalSongs != 0) System.out.println(songs.get(pointer));
        else System.out.println("No songs in the play list");
    }

    public void removeSong(Song song){
        int index = -1;
        for(int i=0;i<totalSongs; i++){
            if(songs.get(i).getId() == song.getId()){
                index = i;
                this.totalSongs--;
                break;
            }
        }
        if(index!=-1) songs.remove(index);
        else System.out.format("No song named %s found",song.getName());
    }

}
