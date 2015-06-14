public class Node {

	public String prefix;
	public Node[] letters;
	public boolean valid;

	public Node(String prefix, boolean valid) {
		this.prefix = prefix;
		letters = new Node[26];
		this.valid = valid;
	}

}