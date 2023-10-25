package tree;

public class BinarySearchTree<T extends Comparable<T>> {

	private Node<T> root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(T obj) {
		Node<T> newNode = new Node<T>(obj);
		if (root == null)
			root = newNode;
		else
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
	
	public void remove(T element) {
		root = remove(root, element);
	}

	public Node<T> remove(Node<T> node, T element) {
		if (node == null) {
			return node;
		}

		int current = element.compareTo(node.value);

		if (current < 0) {
			node.left = remove(node.left, element);
		} else if (current > 0) {
			node.right = remove(node.right, element);
		} else {

			if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			}

			node.value = minValue(node.right);

			node.right = remove(node.right, node.value);
		}
		return node;
	}

	public T minValue(Node<T> node) {
		T minValue = node.value;
		while (node.left != null) {
			minValue = node.left.value;
			node = node.left;
		}
		return minValue;
	}
	
	public T min() throws EmptyTreeException {
		if (root == null) {
			throw new EmptyTreeException();
		}
		return min(root).value;
	}

	private Node<T> min(Node<T> node) {
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}

	
	public T max() throws EmptyTreeException {
		if (root == null) {
			throw new EmptyTreeException();
		}
		return max(root).value;
	}

	private Node<T> max(Node<T> node) {
		while (node.right != null) {
			node = node.right;
		}
		return node;
	}
	
	public void convertToVector() throws EmptyTreeException {

				
		if (root != null) {
			root.convert();
		} else {
			throw new EmptyTreeException();
		}
		
	}


}
