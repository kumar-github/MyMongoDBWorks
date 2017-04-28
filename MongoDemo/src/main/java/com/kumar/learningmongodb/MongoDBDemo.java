package com.kumar.learningmongodb;

import com.mongodb.MongoClient;

/**
 * @author Saravana Kumar M
 *
 */
public class MongoDBDemo
{
	public static void main(final String[] args)
	{
		final MongoClient mongoClient = new MongoClient("localhost", 27017);
		System.out.println(mongoClient);
		System.out.println(mongoClient.getDatabaseNames());
		System.out.println(mongoClient.getDB("test"));
		System.out.println(mongoClient.getDB("test").getCollectionNames());
		mongoClient.close();
	}
}