public class testBST_66_G2 {

	/* Extend the BST class by developing the new methods: 
        - Sum: returns the sum of all BST nodes
        - SumLeaves: returns the sum of all BST leaves
		- CountOdd: counts number of nodes storing odd values
        - CountSingleParents: returns how many nodes have a single child.
        - RightDoubleLeft: counts number of nodes having right's value equal to double to left's value
        - NumberOfSingleParent: counts number of nodes having a unique child
        - Max: returns the maximum of the BST.
        - Min: returns the minimum of the BST.
		- Sum (returns the sum of all the tree's items), 
		- NumberOfOccurrences (counts the number of time an item multiple of VAL appeared in the tree), 
		- Equal  (checks if two trees are equal).
	*/

	public static void main(String[] args) {
		BST_Integer_66_G2 tree1, tree2;
		WASTEWISE_66_G2 wastewise = new WASTEWISE_66_G2();
		TreeNode_66_G2 treeNode1 = new TreeNode_66_G2( 25, 35, 52, 6, 7);
		TreeNode_66_G2 treeNode2 = new TreeNode_66_G2( 32.8, 20.1, 90, 9, 5);
		TreeNode_66_G2 treeNode3 = new TreeNode_66_G2( 41.9, 33, 45, 5, 32);
		TreeNode_66_G2 treeNode4 = new TreeNode_66_G2( 52, 35, 32, 6, 14);
		TreeNode_66_G2 treeNode5 = new TreeNode_66_G2( 20.2, 96, 75, 4, 22);
		
		wastewise.addTreeNode(treeNode1);
		wastewise.addTreeNode(treeNode2);
		wastewise.addTreeNode(treeNode3);
		wastewise.addTreeNode(treeNode4);
		wastewise.addTreeNode(treeNode5);
		
		System.out.println("Wastewise: ");
		wastewise.print();
		
		//System.out.print("InOrder : ");  tree1.inorder();System.out.print("\n"); 
		//System.out.print("postOrder : ");  tree1.postorder();System.out.print("\n"); 
		//System.out.print("PreOrder : ");  tree1.preorder();System.out.print("\n"); 
		
		System.out.println("Tree1: "); 
		tree1.print();

	}

}
