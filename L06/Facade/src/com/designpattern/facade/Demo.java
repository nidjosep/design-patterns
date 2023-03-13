package com.designpattern.facade;

public class Demo {
  public static void main(String[] args) {
    show();
  }

  public static void show() {
    var oauth = new OAuth();
    var twitterClient = new TwitterClient();
    var apiFacade = new TwitterAPIFacade(oauth, twitterClient);

    apiFacade.getRecentTweets("appKey", "secret");
    apiFacade.composeNewTweet("appKey", "secret", "Hello Twitter!");
    apiFacade.likeTweet("appKey", "secret", "123456789");
  }
}
