package domein;

public abstract class ProjectItem {

    private final String name;
    private final String description;
    private final double rate;
    private final double time;
    private final double VAT = 0.21;
    
    public ProjectItem(String newName, String newDescription, double newRate, double prodTime) {
        name = newName;
        description = newDescription;
        rate = newRate;
        time=prodTime;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getRate() {
        return rate;
    }
    
    protected double getTime() {
    	return time;
    }
    

    public double getCostEstimate() {
        double cost = (getTime() * getRate() + getMaterialsCost());
        if(includeVAT()) {
        	cost = cost * (1+VAT);
        }
        return cost;
    }

    protected boolean includeVAT() {
    	return false;
    };

	@Override
    public String toString() {
        return getName();
    }

	public double getMaterialsCost() {
		return 0;
	}

}
