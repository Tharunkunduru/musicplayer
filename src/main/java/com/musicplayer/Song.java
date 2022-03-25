package com.musicplayer;

public class Song {
    private String name;
    private String duration;
    private long id;
    Song(String name,String duration){
        this.name = name;
        this.duration = duration;
        this.id = name.hashCode();
    }

    public void setName(String name) {
        this.name = name;
        this.id = name.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
