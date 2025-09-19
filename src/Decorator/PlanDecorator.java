package Decorator;

abstract public class PlanDecorator implements Plan {
    Plan plan;
    public PlanDecorator(Plan plan) {
        this.plan = plan;
    }
    @Override
    public String nombrePlan(){
        return plan.nombrePlan();
    }
    public float precioPlan(){
        return plan.precioPlan();
    }


}
