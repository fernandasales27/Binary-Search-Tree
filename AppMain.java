package tree;

public class AppMain {

	public static void main(String[] args) {
		try {
			BinarySearchTree<String> alunosADS = new BinarySearchTree<String>();

			alunosADS.insert("Rebecca");
			alunosADS.insert("Ingrid");
			alunosADS.insert("Urias");
			alunosADS.insert("Fernanda");
			alunosADS.insert("Ricardo");

			alunosADS.inOrder();
		} catch (Exception E) {
			System.out.println(E.getMessage());
		}
	}

}
