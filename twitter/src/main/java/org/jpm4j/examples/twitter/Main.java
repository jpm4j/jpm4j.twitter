package org.jpm4j.examples.twitter;

import twitter4j.*;

public class Main {

	public static void main(String args[]) throws TwitterException {
		Twitter twitter = new TwitterFactory().getInstance();
		Query query = new Query("osgi");
		QueryResult result = twitter.search(query);
		for (Tweet tweet : result.getTweets()) {
			System.out.printf("@%-20s %s\n", tweet.getFromUser(), tweet.getText());
		}
	}

}
