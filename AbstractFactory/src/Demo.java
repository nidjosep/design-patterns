
public class Demo {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.setGoal(new WeightLossFactory());
        homePage.setGoal(new StrengthTrainingFactory());
        homePage.setGoal(new GettingActiveFactory());
    }
}
