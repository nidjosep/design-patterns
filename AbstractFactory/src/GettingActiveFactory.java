
public class GettingActiveFactory implements GoalFactory{
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new GettingActiveWorkout();
    }

    @Override
    public MealPlan createMealPlan() {
        return new GettingActiveMealPlan();
    }

}
