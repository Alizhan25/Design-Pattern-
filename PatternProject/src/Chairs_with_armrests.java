public class Chairs_with_armrests extends Chair_Decorator{
    public Chairs_with_armrests(Decorator_Pattern d) {
        super(d);
    }
    @Override
    public void add(){
        super.add();
        System.out.println("Price for chairs with armrests 49.99$");
    }
}
