package com.hacker_rank.data_structures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Statement

There are N sequences. All of them are initially empty, and you are given a variable lastans=0. You are given Q queries of two different types:

"1 x y" - Insert y at the end of the ((x<>lastans) mod N)th sequence.
"2 x y" - Print the value of the (y mod size)th element of the ((x<>lastans) mod N)th sequence. Here, size denotes the size of the related sequence. Then, assign this integer to lastans.
Note: You may assume that, for the second type of query, the related sequence will not be an empty sequence. Sequences and the elements of each sequence are indexed by zero-based numbering.

The <> symbol denotes the xor operation. You can get more information about it from Wikipedia. It is defined as ^ in most of the modern programming languages.

Input Format

The first line consists of N, number of sequences, and Q, number of queries, separated by a space. The following Q lines contains one of the query types described above.

Constraints 
1<=N,Q<=105 
0<=x<=109 
0<=y<=109
Output Format

For each query of type two, print the answer on a new line.
 */
public class _03_DynamicArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
	}
}
