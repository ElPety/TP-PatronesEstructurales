package Decorator;

public class PlanBasico implements Plan{
    @Override
    public String nombrePlan(){
        return "Plan Basico";
    };
    public float precioPlan(){
        return 1000;
    }

}
