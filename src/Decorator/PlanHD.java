package Decorator;

public class PlanHD extends PlanDecorator{

    public PlanHD(Plan plan) {
        super(plan);
    }
    @Override
    public String nombrePlan() {
        return plan.nombrePlan() + "Resolucion HD";
    }
    public float precioPlan() {
        return plan.precioPlan() + 500;
    }
}
