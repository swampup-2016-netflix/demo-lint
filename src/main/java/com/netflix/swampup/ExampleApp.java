package com.netflix.swampup;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.s3.AmazonS3Client;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;

public class ExampleApp {
	public static void main(String[] args) {
		AmazonS3Client client = new AmazonS3Client(new DefaultAWSCredentialsProviderChain());
		client.listObjects("mybucket")
				.getObjectSummaries()
				.forEach(System.out::println);
	}

	public void somethingWithJackson() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.readValue("[1,2,3]", ArrayList.class);
	}
}