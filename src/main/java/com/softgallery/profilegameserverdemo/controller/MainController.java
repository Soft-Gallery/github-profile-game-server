package com.softgallery.profilegameserverdemo.controller;

import com.softgallery.profilegameserverdemo.domain.Profile;
import com.softgallery.profilegameserverdemo.service.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private final ProfileService profileService = new ProfileService();

    @GetMapping("/")
    public String test() { return "test"; }

    @GetMapping("/{name}")
    @ResponseBody
    public Profile searchProfile(@PathVariable("name") String name) {
        System.out.println(name);

        return profileService.getProfile(name);
    }

    @GetMapping("/profile")
    @ResponseBody
    public Profile printProfile() {
        return new Profile(0L, "Jaehoon", "00:01:02", "2024-01-01");
    }
}
