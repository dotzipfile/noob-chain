package com.dotzipfile.noob_chain;

import java.util.ArrayList;

import com.google.gson.GsonBuilder;

import com.dotzipfile.noob_chain.models.Block;

public class NoobChain {

	public static ArrayList<Block> blockChain = new ArrayList<Block>(); 

	public static void main(String[] args) {

		blockChain.add(new Block("Hi this is the first block.", "0"));
		blockChain.add(new Block("Hi this is the second block.", blockChain.get(blockChain.size() - 1).getHash()));
		blockChain.add(new Block("Hi this is the third block.", blockChain.get(blockChain.size() - 1).getHash()));

		String blockChainJSON = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
		System.out.println(blockChainJSON);
	}
}
