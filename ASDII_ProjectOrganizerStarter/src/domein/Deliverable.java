package domein;

public class Deliverable extends ProjectItem {

    private final double materialsCost;


    public Deliverable(String name, String description,
            double materialsCost, double productionTime, double rate) {
        super(name, description, rate, productionTime);
        this.materialsCost = materialsCost;
    }

    @Override
    public double getMaterialsCost() {
        return materialsCost;
    }

    
}
