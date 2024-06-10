public class BmiService {

    public int calculate(int weight, double height) {
        double rezult;
        rezult = weight / (height * height);
        return (int)rezult;

    }
}
