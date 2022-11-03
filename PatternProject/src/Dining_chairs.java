public class Dining_chairs extends Chair_Decorator{
    public Dining_chairs(Decorator_Pattern d) {
        super(d);
    }
    @Override
    public void add(){
        super.add();
        System.out.println("Price for dining chair 31.99$");
    }
}
