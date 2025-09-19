package Decorator;

public class PlanUltraHD extends PlanDecorator{
    public PlanUltraHD(Plan plan) {
        super(plan);
    }
    @Override
    public String nombrePlan() {
        if (plan instanceof PlanHD){
            return plan.nombrePlan() + " Ultra HD";
        }else {
            return plan.nombrePlan() + "HD, Ultra HD";
        }
    }
    public float precioPlan() {
        if (plan instanceof PlanHD){
            return plan.precioPlan()+ 1000;
        }else {
            return plan.precioPlan() + 500 + 1000;
        }
    }
}
