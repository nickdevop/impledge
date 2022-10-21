package impledge;
// pair class to store string and its length to check later 
//and find longest and second longest
public class Pair<T> {
	private T first;
	private T second;
	
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	// return first element
	public T first() {
		return first;
	}
	
	// return second element
	public T second() {
		return second;
	}
}
