package com.softgallery.profilegameserverdemo.controller;

import com.softgallery.profilegameserverdemo.service.GithubAPIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubAPIController {
    private final GithubAPIService githubAPIService = new GithubAPIService();

    @GetMapping("/github/{name}")
    public String printGithubProfile(@PathVariable("name") String name) {
        System.out.println(name);
        String repo = "spring-roomescape-playground";

        return printCommitInfo(name, repo);
    }

    private String printCommitInfo(String owner, String repo) {
        return githubAPIService.getCommits(owner, repo);
    }
}
