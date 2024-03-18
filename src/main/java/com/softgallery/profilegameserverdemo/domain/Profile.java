package com.softgallery.profilegameserverdemo.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Profile {
    private final Long id;
    private final String name;
    private final LocalTime recentTime;
    private final LocalDate recentDate;

    public Profile(final Long id, final String name, final String time, final String date) {
        this.id = id;
        this.name = name;
        this.recentTime = LocalTime.parse(time);
        this.recentDate = LocalDate.parse(date);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalTime getRecentTime() {
        return recentTime;
    }

    public LocalDate getRecentDate() {
        return recentDate;
    }
}
