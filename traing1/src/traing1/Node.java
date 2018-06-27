package traing1;


public class Node {
	public String operator;
	public Node next;
	public Node(String data, Node node) {
		super();
		this.operator = data;
		this.next = node;
	}

	public Node(String opretor) {
		super();
		this.operator = opretor;
		this.next = null;
	}

	public String getData() {
		return operator;
	}

	public void setData(String operator) {
		this.operator = operator;//Operator
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String toString() {
		return operator;
	}}
