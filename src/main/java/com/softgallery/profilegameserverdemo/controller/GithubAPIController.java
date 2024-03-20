package com.softgallery.profilegameserverdemo.controller;

import com.softgallery.profilegameserverdemo.service.GithubAPIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubAPIController {
    private final GithubAPIService githubAPIService = new GithubAPIService();

    @GetMapping("/commit/{name}")
    public String getCommitInfoByName(@PathVariable("name") String name) {
        System.out.println(name);
        String repo = "spring-roomescape-playground";   // repo 이름을 수정하여 넣을 것

        return githubAPIService.getCommits(name, repo);
    }
}
