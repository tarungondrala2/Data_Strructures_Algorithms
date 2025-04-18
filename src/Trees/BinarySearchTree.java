package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	
	Node root;
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		
		if(root == null) {
			root = newNode;
			return true;
		}
		
		Node temp = root;
		
		while(true) {
			if(newNode.value == temp.value) return false;
			if(newNode.value < temp.value) {
				if(temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			}
			else {
				if(temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}
	
	public boolean contains(int value) {
		
		Node temp = root;
		while(temp != null) {
			if(temp.value < value) {
				temp = temp.left;
			}
			else if(temp.value > value) {
				temp = temp.right;
			}
			else {
				return true;
			}
		}
		return false;
	}

	
	// <--------------- recursive function ------------->
	
	/*
	 * This method will check if the give is available in the BST using recursion.
	 */
	 public boolean rContains(int value) {
		 return rContains(root, value);
	 }
	
	 /*
	  * This method is helper for rContains and implements recursion.
	  */
	 private boolean rContains(Node currentNode, int value) {
		 
		 if(currentNode == null) return false;
		 
		 if(currentNode.value == value) return true;
		 
		 if(value < currentNode.value) {
			 return rContains(currentNode.left, value);
		 } else {
			 return rContains(currentNode.right, value);
		 }
	 }
	 
	 /*
	  * This method will insert a node into BST using recursion.
	  */
	 public void rInsert(int value) {
		 
		 if(root == null) root = new Node(value);
		 rInsert(root, value);
	 }
	 
	 /*
	  * This method is helper for rInsert and implements recursion.
	  */
	 private Node rInsert(Node currentNode, int value) {
		 
		 if(currentNode == null) return new Node(value);
		 
		 if(value < currentNode.value) {
			 currentNode.left = rInsert(currentNode.left, value);
		 } else if(value > currentNode.value) {
			 currentNode.right = rInsert(currentNode.right, value);
		 }
		 
		 return currentNode;
	 }
	 
	 /*
	  * This method will delete a node from BST using recursion.
	  */
	 public void deleteNode(int value) {
		 deleteNode(root, value);
	 }
	 
	 /*
	  * This method is a helper to delete a node from BST and implements recursion.
	  */
	 private Node deleteNode(Node currentNode, int value) {
		 
		 if(currentNode == null) return null;
		 
		 if(value < currentNode.value) {
			 currentNode.left = deleteNode(currentNode.left, value);
		 } else if(value > currentNode.value) {
			 currentNode.right = deleteNode(currentNode.right, value);
		 } else {
			 if(currentNode.left == null && currentNode.right == null) {
				 currentNode = null;
			 } else if (currentNode.left == null) {
				 currentNode = currentNode.right;
			 } else if (currentNode.right == null) {
				 currentNode = currentNode.left;
			 } else {
				 int subTreeMin = minValue(currentNode.right);
				 currentNode.value = subTreeMin;
				 currentNode.right = deleteNode(currentNode.right, subTreeMin);
			 }
		 }
		 
		 return currentNode;
	 }
	 
	 /*
	  * This method is a helper to determine minimum value in the BST.
	  */
	 private int minValue(Node currentNode) {
		 
		 while(currentNode.left != null) {
			 currentNode = currentNode.left;
		 }
		 
		 return currentNode.value;
	 }
	 
	 
	 // <----------------- Tree Traversal operations --------------------------->
	 
	 /*
	  * This method implements Breath First Search tree traversal operation;
	  */
	 public ArrayList<Integer> BFS() {
		  
		 Node currentNode = root;
		 Queue<Node> queue = new LinkedList<>();
		 ArrayList<Integer> results = new ArrayList<>();
		 
		 queue.add(currentNode);
		 
		 
		 while(queue.size() > 0) {
			 currentNode = queue.remove();
			 results.add(currentNode.value);
			 if(currentNode.left != null) {
				 queue.add(currentNode.left);
			 }
			 if(currentNode.right != null) {
				 queue.add(currentNode.right);
			 }
		 }
		 return results;
	 }
	 
	 /*
	  * This method implements Depth First Search Pre order tree traversal operation using recursion
	  */
	 public ArrayList<Integer> DFSPreOrder() {
		 
		 ArrayList<Integer> results = new ArrayList<>();
		 
		 class Traverse {
			 Traverse(Node currentNode) {
				 results.add(currentNode.value);
				 
				 if(currentNode.left != null) {
					 new Traverse(currentNode.left);
				 }
				 if(currentNode.right != null) {
					 new Traverse(currentNode.right);
				 }
			 } 
		 }
		 
		 new Traverse(root);
		 return results;
	 } 
	 
	 /*
	  * This method implements Depth First Search Post order tree traversal operation using recursion.
	  */
	 public ArrayList<Integer> DFSPostOrder() {
		 
		 ArrayList<Integer> results = new ArrayList<>();
		 
		 class Traverse {
			 
			 Traverse(Node currentNode) {
				 if(currentNode.left != null) {
					 new Traverse(currentNode.left);
				 }
				 if(currentNode.right != null) {
					 new Traverse(currentNode.right);
				 }
				 results.add(currentNode.value);
			 }
		 }
		 
		 new Traverse(root);
		 return results;
	 }
	 
	 public ArrayList<Integer> DFSInOrder() {
		 
		 ArrayList<Integer> results = new ArrayList<>();
		 
		 class Traverse {
			 
			 Traverse(Node currentNode) {
				 
				 if(currentNode.left != null) {
					 new Traverse(currentNode.left);
				 }
				 
				 results.add(currentNode.value);
				 
				 if(currentNode.right != null) {
					 new Traverse(currentNode.right);
				 }
			 }
		 }
		 
		 new Traverse(root);
		 return results;
	 }
	 
}
