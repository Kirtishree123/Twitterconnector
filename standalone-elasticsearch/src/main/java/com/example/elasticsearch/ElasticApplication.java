package com.example.elasticsearch;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@SpringBootApplication
public class ElasticApplication {

	public static void main(String[] args) throws TwitterException {
		getTwitterinstance();
		SpringApplication.run(ElasticApplication.class, args);
	}
	
	
	public static void getTwitterinstance() throws TwitterException {
		/**
		 * if not using properties file, we can set access token by following way
		 */
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		        .setOAuthConsumerKey("IIdPynT17s2qr8wJByHQSqqhZ")
		        .setOAuthConsumerSecret("sQS05XAQXAuFcGuouHDATrQJ8ruD5eusQmk9r01x0kQaFOnRc4")
		        .setOAuthAccessToken("1263407896135643137-Bnv13RrqSUBeyC69ONytOzupr7mTLt")
		        .setOAuthAccessTokenSecret("1QPPVo3LqQsG08BmII6VjDzN6Jegi8fAp614ucyI3FSM6");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();

		// Gets timeline.
//		Twitter twit = TwitterFactory.getSingleton();
//		List<Status> statuses = twitter.getHomeTimeline();
//		System.out.println("Showing home timeline.");
//		for (Status status : statuses) {
//		    System.out.println(status.getUser().getName() + ":" +
//		                       status.getText());
//		}
		System.out.println("_________________________-----------------------------");
		Query query = new Query("#verizon");
		query.setCount(100);
	    QueryResult result = twitter.search(query);
	    for (Status status : result.getTweets()) {
	    	System.out.println("twittername---" + status.getUser().getScreenName() + ":"+"Location-- :"+ status.getUser().getLocation()+"Usertext --:" + status.getText()+"date & time--:"+status.getCreatedAt());
	    }
		

		
	}
}

