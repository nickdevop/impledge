package impledge;
import java.util.*;

public class Trie {
	
	private Node curr;
	
private static Node root;

	void Trie()					// Trie constructor
	{
		root =new Node();
	}
	
	public static void insert(String word)  // function to insert the string in trie data structure
	{
		Node node =root;
		  for(int i=0;i<word.length();i++){
	          if(!node.containsKey(word.charAt(i)) )
	        		  {
	        	  node.put(word.charAt(i),new Node());
	        		  }
	          node =node.get(word.charAt(i));
		  }
	node.setEnd();
	}

	boolean checkIfPrefixExist(String word)  // function to check if prefux is exist or not
	{
		Node node = root;
        boolean flag = true; 
        for(int i = 0;i<word.length() && flag;i++) {
            if(node.containsKey(word.charAt(i))) {
                node = node.get(word.charAt(i)); 
                flag = flag & node.isEnd(); 
            }
            else {
                return false; 
            } 
        }
        return flag; 
	}
	// return starting indices of all suffixes of a word
		public List<Integer> getSuffixesStartIndices(String s) {
			List<Integer> indices = new LinkedList<Integer>();	// store indices
			char letter;
			curr = root;	// start from root
			
			for (int i = 0; i < s.length(); i++) {
				letter = s.charAt(i);
				
				// if the current letter doesn't have one letter as child
				// which means trie currently doesn't have the relationship
				// returns indices of suffixes
				if (!curr.containsKey(letter))
					return indices;
				
				// move on to the child node
				curr = curr.get(letter);
				
				// if the letter is an end to a word, it means after the letter is a suffix
				// update indices
				if (curr.isEnd())
					indices.add(i + 1);
			}
			
			return indices;
		}
	
	}