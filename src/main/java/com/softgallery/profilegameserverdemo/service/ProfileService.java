package com.softgallery.profilegameserverdemo.service;

import com.softgallery.profilegameserverdemo.domain.Profile;
import java.util.ArrayList;

public class ProfileService {
    private final ArrayList<Profile> profiles = new ArrayList<>();

    public ProfileService() {
        initialize();
    }

    // Initialization with test-cases
    private void initialize() {
        profiles.add(new Profile(1L, "Jaehoon", "00:01:02", "2024-01-01"));
        profiles.add(new Profile(2L, "SHKim55", "23:00:00", "2024-12-23"));
        profiles.add(new Profile(3L, "Sumin", "22:00:00", "2023-12-23"));
        profiles.add(new Profile(4L, "YongWoo", "21:00:00", "2023-11-23"));
        profiles.add(new Profile(5L, "Hangyul", "20:00:00", "2023-10-23"));
    }

    public ArrayList<Profile> getAllProfiles() {
        return profiles;
    }

    // Find profile by name
    public Profile getProfile(String name) {
        for(Profile profile : profiles) {
            if (profile.getName().equals(name))
                return profile;
        }
        return new Profile(0L, "No Such User", "00:00:00", "0000-00-00");
    }
}