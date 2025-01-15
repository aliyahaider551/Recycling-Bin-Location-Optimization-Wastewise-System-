public class TreeNode_66_G2<E extends Comparable<E>> {
	protected E element;
	protected TreeNode_66_G2<E> left, right;
	private double latitude;
    private double longitude;
    private int    wasteGenerationRate;
    private double populationDensity;
    private double proximityToOtherBins;

    
    public TreeNode_66_G2() {
    }
    public TreeNode_66_G2(double latitude, double longitude, int wasteGenerationRate, double populationDensity,
			double proximityToOtherBins) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.wasteGenerationRate = wasteGenerationRate;
		this.populationDensity = populationDensity;
		this.proximityToOtherBins = proximityToOtherBins;
	} 
    
    
	public TreeNode_66_G2(E e) {
       element = e;
	}
	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public int getWasteGenerationRate() {
		return wasteGenerationRate;
	}


	public void setWasteGenerationRate(int wasteGenerationRate) {
		this.wasteGenerationRate = wasteGenerationRate;
	}


	public double getPopulationDensity() {
		return populationDensity;
	}


	public void setPopulationDensity(double populationDensity) {
		this.populationDensity = populationDensity;
	}

	public double getProximityToOtherBins() {
		return proximityToOtherBins;
	}

	public void setProximityToOtherBins(double proximityToOtherBins) {
		this.proximityToOtherBins = proximityToOtherBins;
	}

	public boolean hasLeft () { return left != null;}
	public boolean hasRight () { return right != null;}
	public boolean hasTwoChildren () { return left != null && right != null;}
	public boolean isLeaf () { return left == null && right == null;}
	
	
	 
  }
