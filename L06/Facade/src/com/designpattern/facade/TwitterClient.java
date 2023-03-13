package com.designpattern.facade;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {
  public List<Tweet> getRecentTweets(String accessToken) {
    System.out.println("Getting recent tweets");

    return new ArrayList<>();
  }

  public void composeNewTweet(String accessToken, String tweet) {
    System.out.println("Composing new tweet: " + tweet);
  }

  public void likeTweet(String accessToken, String tweetId) {
    System.out.println("Liking tweet: " + tweetId);
  }
}
