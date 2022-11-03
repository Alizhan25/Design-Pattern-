public class Dining_Table extends Table_Decorator{
    public Dining_Table(Decorator_Pattern d) {
        super(d);
    }
    @Override
    public void add(){
        super.add();
        System.out.println("Price for dining table 25.99$");
    }
}
