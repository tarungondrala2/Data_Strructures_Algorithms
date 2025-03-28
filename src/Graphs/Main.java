/**
 * 
 */
package Graphs;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph myGraph = new Graph();
		
		myGraph.addVertex("A");
		myGraph.addVertex("B");
		myGraph.addVertex("C");
		myGraph.addVertex("D");
		
		myGraph.addEdge("A", "B");
		myGraph.addEdge("B", "C");
		myGraph.addEdge("C", "D");
		
		myGraph.printGraph();
		
		myGraph.removeEdge("B", "A");
		
		myGraph.printGraph();
	}

}
