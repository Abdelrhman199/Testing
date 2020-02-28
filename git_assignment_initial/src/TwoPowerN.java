public class TwoPowerN implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double power=Double.parseDouble(input);
        System.out.println(Math.pow(2,power));
    }
}
