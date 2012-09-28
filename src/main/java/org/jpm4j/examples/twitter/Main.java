package org.jpm4j.examples.twitter;

import twitter4j.*;

public class Main {

	public static void main(String args[]) throws TwitterException {
		System.out.println("JTwitter");
		Twitter twitter = new TwitterFactory().getInstance();
		Query query = new Query(args.length == 0 ? "java" : args[0]);
		QueryResult result = twitter.search(query);

		for (Tweet tweet : result.getTweets()) {
			System.out.printf("@%-20s %s\n", tweet.getFromUser(), tweet.getText());
		}
	}
}
