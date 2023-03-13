package com.designpattern.facade;

import java.util.List;

public class TwitterAPIFacade {
    private OAuth oauth;
    private TwitterClient twitterClient;

    public TwitterAPIFacade(OAuth oauth, TwitterClient twitterClient) {
        this.oauth = oauth;
        this.twitterClient = twitterClient;
    }

    public List<Tweet> getRecentTweets(String appKey, String appSecret) {
        var requestToken = oauth.requestToken(appKey, appSecret);
        var accessToken = oauth.getAccessToken(requestToken);
        return twitterClient.getRecentTweets(accessToken);
    }

    public void composeNewTweet(String appKey, String appSecret, String tweet) {
        var requestToken = oauth.requestToken(appKey, appSecret);
        var accessToken = oauth.getAccessToken(requestToken);
        twitterClient.composeNewTweet(accessToken, tweet);
    }

    public void likeTweet(String appKey, String appSecret, String tweetId) {
        var requestToken = oauth.requestToken(appKey, appSecret);
        var accessToken = oauth.getAccessToken(requestToken);
        twitterClient.likeTweet(accessToken, tweetId);
    }
}
