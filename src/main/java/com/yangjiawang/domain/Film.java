package com.yangjiawang.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

public class Film {
    private Integer id;

    private String filename;

    private String movielinks;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date showtime;

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", filename='" + filename + '\'' +
                ", movielinks='" + movielinks + '\'' +
                ", showtime=" + showtime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getMovielinks() {
        return movielinks;
    }

    public void setMovielinks(String movielinks) {
        this.movielinks = movielinks == null ? null : movielinks.trim();
    }



    public Date getShowtime() { return showtime; }

    public void setShowtime(Date showtime) { this.showtime = showtime; }
}