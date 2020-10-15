package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        this(title, maturityRating, null);
    }

    public Movie(String title, Rating maturityRating, Genre genre) {
        super(title, maturityRating);
        this.genre = genre;
    }

    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        if (duration == 0) {
            return "?";
        }
        int uren = duration / 60;
        int minuten = duration % 60;
        if (uren == 0) {
            return minuten + " min";
        }
        if (minuten == 0) {
            return uren + " h";
        }
        return uren + " h " + minuten + " min";
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration < 0) {
            duration = Math.abs(duration);
        }
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void play() {
        if (this instanceof Documentary) {
            System.out.print("Playing " + this);
        } else {
            System.out.println("Playing " + this);
        }
    }

    @Override
    public void pause() {
        if (this instanceof Documentary) {
            System.out.print("Pausing " + this);
        } else {
            System.out.println("Pausing " + this);
        }
    }

    @Override
    public String toString() {
        if (releaseDate != null) {
            return super.toString() + " sinds " + releaseDate.getYear();
        }
        return super.toString();
    }
}