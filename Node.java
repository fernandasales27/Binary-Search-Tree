package tree;

import java.util.ArrayList;
import java.util.List;

class Node<U extends Comparable<U>> {
	public U value;
	public Node<U> left, right;
	public Integer balancefactor;

	public Node(U element) {
		value = element;
		left = right = null;
	}

	public void insertNode(Node<U> newNode) {
		if (newNode.value.compareTo(value) < 0) {
			if (left == null)
				left = newNode;
			else
				left.insertNode(newNode);
		} else {
			if (right == null)
				right = newNode;
			else
				right.insertNode(newNode);
		}
	}

	public void printNodesPreOrder() {
		System.out.println(value);
		if (left != null)
			left.printNodesPreOrder();
		if (right != null)
			right.printNodesPreOrder();
	}

	public void printNodesInOrder() {
		if (left != null)
			left.printNodesInOrder();
		System.out.println(value);
		if (right != null)
			right.printNodesInOrder();
	}

	public void printNodesPostOrder() {
		if (left != null)
			left.printNodesPostOrder();
		if (right != null)
			right.printNodesPostOrder();
		System.out.println(value);
	}
	
	public List<U> convert() {
		List<U> lista =  new ArrayList<>();
		
		if (left != null)
			left.convert();
		lista.add(value);
		if (right != null)
			right.convert();

		return lista;
	
        }
	}
	
