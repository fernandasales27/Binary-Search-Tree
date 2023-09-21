package tree;

public class BinarySearchTree<T extends Comparable<T>> {

	private Node<T> root;
root.insertNode(newNode);
	}

	public void inOrder() throws EmptyTreeException {
		if (root != null) {
			root.printNodesInOrder();
		} else {
			throw new EmptyTreeException();
		}
	}
	
	public void preOrder() throws EmptyTreeException {
		if (root != null) {
			root.printNodesPreOrder();
		} else {
			throw new EmptyTreeException();
		}
	}
	
	public void postOrder() throws EmptyTreeException {
		if (root != null) {
			root.printNodesPostOrder();
		} else {
			throw new EmptyTreeException();
		}
	}
	public BinarySearchTree() {
		root = null;
	}

	public void insert(T obj) {
		Node<T> newNode = new Node<T>(obj);
		if (root == null)
			root = newNode;
		else
			

	public void max(){

	}
	public void min(){
		
	}
	public void Remove(){
		
	}

}