package traing1;


public class Stack {// this class have of stake
	private Node topOfStak;
	int size = 0;

	public Stack() {
		super();
		topOfStak = null;
		// TODO Auto-generated constructor stub
	}

	public boolean isEmpty() {
		return topOfStak == null;
	}

	public void makeEmpty() {
		// make stack logically empty
		topOfStak = null;
		size = 0;// size for stack

	}

	public String getTop() {
		if (isEmpty()) {
			return "";
		}
		return topOfStak.getData();
	}

	public Node pop() {
		Node temp = topOfStak;
		if (topOfStak == null) {
			return null;

		} else {
			topOfStak = topOfStak.getNext();
			temp.next = null;
			size--;

			return temp;
		}
	}

	public void push(String x) {
		if (topOfStak == null) {
			topOfStak = new Node(x);
		} else {
			topOfStak = new Node(x, topOfStak);
		}
	}

}