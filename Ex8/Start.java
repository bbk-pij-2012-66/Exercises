public class Start {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start script = new Start();				
		script.launch();
		
	}
	
	
	public void launch() {
		IntegerTreeNode myTree = new IntegerTreeNode(6);
	
		myTree.add(9);
		myTree.add(5);
		myTree.add(3);
		myTree.add(8);
		myTree.add(11);
		myTree.add(12);
		
		//System.out.println(myTree.contains(9));
		System.out.println("Max is " + myTree.getMax());
		System.out.println("Min is " + myTree.getMin());
		System.out.println(myTree.toString());
		System.out.println("The tree is " + myTree.getDepth(0) + " levels deep");
	}
	
}