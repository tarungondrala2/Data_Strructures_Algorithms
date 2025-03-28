/**
 * 
 */
package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */
public class Graph {
	
	private HashMap<String, ArrayList<String>> adjList = new HashMap<>();
	
	/*
	 *  This method add's a vertex to Graph.
	 */
	public boolean addVertex(String vertex) {
		
		if(adjList.get(vertex) == null) {
			adjList.put(vertex, new ArrayList<String>());
			return true;
		}
		
		return false;
	}
	
	/*
	 * This method add edge/connects two vertices
	 */
	public boolean addEdge(String vertex1, String vertex2) {
		
		if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
			adjList.get(vertex1).add(vertex2);
			adjList.get(vertex2).add(vertex1);
			return true;
		}
		return false;
	}
	
	/*
	 * This method will remove edge / connection between two vertices
	 */
	public boolean removeEdge(String vertex1, String vertex2) {
		
		if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
			adjList.get(vertex1).remove(vertex2);
			adjList.get(vertex2).remove(vertex1);
			return true;
		}
		
		return false;
	}
	
	/*
	 * This mehtod will print graph to output
	 * */
	public void printGraph() {
		System.out.println(adjList);
	}
	

}
