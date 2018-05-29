package com.dotzipfile.noob_chain;

import com.dotzipfile.noob_chain.models.Block;

public class NoobChain {

	public static void main(String[] args) {

		Block genesisBlock = new Block("Hi I'm the first block.", "0");
		System.out.println("Hash for block 1: " + genesisBlock.getHash());

		Block secondBlock = new Block("Hi I'm the second block.", genesisBlock.getHash());
		System.out.println("Hash for block 2: " + secondBlock.getHash());

		Block thirdBlock = new Block("Hi I'm the third block.", secondBlock.getHash());
		System.out.println("Hash for block 3: " + thirdBlock.getHash());
	}

}
