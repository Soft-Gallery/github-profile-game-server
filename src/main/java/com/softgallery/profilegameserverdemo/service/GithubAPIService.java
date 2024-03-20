package com.softgallery.profilegameserverdemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubAPIService {
    private final String GITHUB_API_URL = "https://api.github.com";

    private final RestTemplate restTemplate = new RestTemplate();

    public GithubAPIService() { }

    public String getCommits(String owner, String repo) {
        String url = GITHUB_API_URL + "/repos/" + owner + "/" + repo + "/commits";
        return restTemplate.getForObject(url, String.class);
    }
}
