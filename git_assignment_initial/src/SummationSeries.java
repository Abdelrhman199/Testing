public class SummationSeries implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        try{
            int value = Integer.parseInt(input);
            double result = (value*(value+1))/2.0;
            System.out.println("the summation from 1 to "+value+" is : "+result);
        }catch (NumberFormatException ignore){

        }
    }
}
