import java.util.ArrayList;

public class WASTEWISE_66_G2 {

     ArrayList<TreeNode_66_G2> treeNodes = this.getTreeNodes();
     //ArrayList<TreeNode_66_G2> allBins = new ArrayList<>();
     
	 private BST_Integer_66_G2 bst;
	 private double wasteGeneretionThreshold = 1000;
	 private double populationDensityThreshold = 900;

	    public WASTEWISE_66_G2() {
	        this.bst = new BST_Integer_66_G2();
	    }
	    
	    public void addTreeNode(TreeNode_66_G2 treeNode) {
	    	int wasteGenerationRate = (int) treeNode.getWasteGenerationRate();
	    	this.bst.insert(wasteGenerationRate);
	    	
	    }
	    public void print() {
	        this.bst.print();
	    }
	    private boolean AddBin(TreeNode_66_G2 treeNode) {
	    	if(treeNode.getWasteGenerationRate() > wasteGeneretionThreshold && treeNode.getPopulationDensity()> populationDensityThreshold) {
	    		return true;
	    	}
	    	return false;	
	    }
	    private boolean RelocateBin(TreeNode_66_G2 treeNode) {
	    	return true;
	    }
	    private TreeNode_66_G2 findOptimizedLocations(TreeNode_66_G2 treeNode) {
	        ArrayList<TreeNode_66_G2> nearbyLocations = this.bst.findEmptyLocations(treeNode);
	        TreeNode_66_G2 optimalLocations = null;
	        for(TreeNode_66_G2 nearLocation: nearbyLocations) {
	        	if(optimalLocations == null || nearLocation.getWasteGenerationRate() < optimalLocations.getWasteGenerationRate()) {
	        		optimalLocations = nearLocation;
	        	}
	        }
	        return optimalLocations;
	    }
	    private void optimizedRelocation(TreeNode_66_G2 treeNode) {
	    	//to find best location for the bin that needs to be removed
	    	TreeNode_66_G2 updatedLocation = findOptimizedLocations(treeNode);
	    	//remove the bin from its current location
	    	this.bst.delete(treeNode.getWasteGenerationRate());
	    	this.treeNodes.remove(treeNode);
	    	//add it to the desired location
	    	this.bst.insert(updatedLocation.getWasteGenerationRate());
	    	this.treeNodes.add(updatedLocation);
	    }
	    
	    public ArrayList<TreeNode_66_G2> optimalLocations(){
	    	ArrayList<TreeNode_66_G2> optimizedLocations = new ArrayList<>();
	    	for(TreeNode_66_G2 treeNode: treeNodes) {
	    		if(AddBin(treeNode)) {
	    			optimizedLocations.add(treeNode);
	    		}
	    		if(RelocateBin(treeNode)) {
	    			optimizedRelocation(treeNode);
	    		}
	    		this.bst.delete(treeNode.getWasteGenerationRate());
	    		this.treeNodes.remove(treeNode);
	    	}
	    	return optimizedLocations;
	    }
	    
}
