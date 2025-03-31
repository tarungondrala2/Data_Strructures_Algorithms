package Trees;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree myBST = new BinarySearchTree();
		
		myBST.insert(47);
		myBST.insert(21);
		myBST.insert(76);
		myBST.insert(18);
		myBST.insert(27);
		myBST.insert(52);
		myBST.insert(82);
		
		System.out.println("\nmyBST contains 27:");
		System.out.println(myBST.rContains(27));
		
		System.out.println("\nmyBST contains 17:");
		System.out.println(myBST.rContains(17));
		
		BinarySearchTree rMyBST = new BinarySearchTree();
		
		rMyBST.rInsert(2);
		rMyBST.rInsert(1);
		rMyBST.rInsert(3);
		
		System.out.println("\nRoot: "+ rMyBST.root.value);
		System.out.println("\nRoot->Left: "+ rMyBST.root.left.value);
		System.out.println("\nRoot->Right: "+ rMyBST.root.right.value);
	}

}
