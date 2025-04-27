package dynamicconnectivity;

public class WeighetedQuickUnionUF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int[] id;
	
	public WeighetedQuickUnionUF(int N) {
		
		id = new int[N];
		for(int i = 0; i < N; i++) id[i] = i;	
	}

	/*
	 * Chases parent pointers until reaches root
	 */
	private int root(int i) {
		while(i != id[i]) i = id[i];
		return i;
	}
	
	/*
	 * Check if p and q have same root
	 */
	public boolean Find(int p, int q) {
		return root(p) == root(q);
	}
}
