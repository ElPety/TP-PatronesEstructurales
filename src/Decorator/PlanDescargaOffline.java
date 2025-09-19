package Decorator;

public class PlanDescargaOffline extends PlanDecorator{
    public PlanDescargaOffline(Plan plan) {
        super(plan);
    }
    @Override
    public String nombrePlan() {
        return plan.nombrePlan() + " Con descarga offline";
    }
    public float precioPlan() {
        return plan.precioPlan() + 700;
    }
}
