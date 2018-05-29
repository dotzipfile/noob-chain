package com.dotzipfile.noob_chain;

import java.util.ArrayList;

import com.dotzipfile.noob_chain.models.Block;

public class NoobChain {

	public static ArrayList<Block> blockChain = new ArrayList<Block>(); 

	public static void main(String[] args) {

		blockChain.add(new Block("Hi I'm the first block.", "0"));
		blockChain.add(new Block("Hi I'm the second block.", blockChain.get(blockChain.size() - 1).getHash()));
		blockChain.add(new Block("Hi I'm the third block.", blockChain.get(blockChain.size() - 1).getHash()));
	}
}
