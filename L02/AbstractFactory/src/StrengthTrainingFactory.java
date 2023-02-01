
public class StrengthTrainingFactory implements GoalFactory{
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new StrengthTrainingWorkout();
    }

    @Override
    public MealPlan createMealPlan() {
        return new StrengthTrainingMealPlan();
    }

}
