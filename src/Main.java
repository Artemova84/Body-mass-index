
public class Main {
    public static void main(String[] args) {

        bmiservice service = new bmiservice();

        int kg = 76;

        double m = 1.7;

        int bmi = service.calculate(kg, m);
        System.out.println(bmi);
    }
}