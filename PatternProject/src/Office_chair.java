public class Office_chair extends Chair_Decorator{
    public Office_chair(Decorator_Pattern d) {
        super(d);
    }
    @Override
    public void add(){
        super.add();
        System.out.println("Price for office chair 45.99$");
    }
}
