// Tree questions day 8
public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode (int num) {
		this.value = num;
	}
	
	// Method 1 get maximum
	public int getMax() {
		// Get the value of the first node.
		// Then check this value against the next node on the right
		if (this.right == null) {
			return this.value;
		} else {
			return this.right.getMax();		
		}
	
	}
	
	// Method 2 get maximum
	public int getMin() {
		// continue going Left until you hit the last one
		if (this.left == null) {
			return this.value;
		} else {
			return this.left.getMin();		
		}
	}
	
	// Method 3 visualise tree as a string 
	public String toString() {
		// the first node is this object
		String mappedTree = new String();
		mappedTree = "[" + this.value + "";
		if (this.left == null) {
			mappedTree = mappedTree + " L[]";
		} else {
			mappedTree = mappedTree + " L" + this.left.toString() + "]";
		}
		if (this.right == null) {
			mappedTree = mappedTree + " R[]";
		} else {
			mappedTree = mappedTree + " R" + this.right.toString() + "]";
		}
		return mappedTree;	
	}
	
	// Method 4 the depth of the tree
	public int getDepth() {
		int deepness = 1;
		
		if (this.left != null) {
			this.left.getDepth();
		}
		if (this.right != null) {
			this.right.getDepth();
		}
		deepness++;
		
		return deepness;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
}
		