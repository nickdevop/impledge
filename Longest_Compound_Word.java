package impledge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Longest_Compound_Word {

Trie trie =new Trie();
	public static void main(String[] args) throws FileNotFoundException {
		
		// input of given test cases 
		File file = new File("input_01.txt");

		//  import Trie from Trie class which i created
		Trie trie = new Trie();
		LinkedList<Pair<String>> queue = new LinkedList<Pair<String>>();
		
		// used to calculate the total amount of compound words
		HashSet<String> compoundWords = new HashSet<String>();
		
		// scan the file 
		// suppress to avoid warning while reading text file as input
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);

		String word;				// a word
		List<Integer> sufindx;	// indices of suffixes of a word
		
		// read words from the file
		// fill up the queue with words which have suffixes, who are
		// candidates to be compound words
		// insert each word in trie
		while (s.hasNext()) {
			word = s.next();		
			sufindx = trie.getSuffixesStartIndices(word);
		
			for (int i : sufindx) {
				if (i >= word.length())		// if index is out of bound
					break;					// it means suffixes of the word has been added to the queue if there is any
				queue.add(new Pair<String>(word, word.substring(i)));
			}
	
			trie.insert(word);
		}
		
		Pair<String> p;				// a pair of word and its remaining suffix
		int maxLength = 0;			// longest compound word length	
		String longest = "";		// string to store longest compound word
		String sec_longest = "";	// string to store second longest compound word

		while (!queue.isEmpty()) {
			p = queue.removeFirst();
			word = p.second();
			
			sufindx = trie.getSuffixesStartIndices(word);
			
			// if no suffixes found, which means no prefixes found
			// discard the pair and check the next pair
			if (sufindx.isEmpty()) {
				continue;
			}
			
			
			for (int i : sufindx) {
				if (i > word.length()) { // sanity check 
					break;
				}
				
				if (i == word.length()) { // no suffix, means it is a compound word
					// check if the compound word is the longest
					// if it is update both longest and second longest
					// then save the word in strings
					if (p.first().length() > maxLength) {
						
						sec_longest = longest;
						maxLength = p.first().length();
						longest = p.first();
					}
			
					compoundWords.add(p.first());	// the word is compound word
					
				} else {
					queue.add(new Pair<String>(p.first(), word.substring(i)));
				}
			}
		}
		
		// print out the results
		System.out.println("Longest Compound Word: " + longest);
		System.out.println("Second Longest Compound Word: " + sec_longest);
		
	
	
		
	}
}