package com.dotzipfile.noob_chain;

import java.util.Date;

public class Block {

	private String hash;
	private String previousHash;
	private String data;
	private long timeStamp;

	public Block(String data, String previousHash) {

		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
	}
}
