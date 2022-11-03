public class Desk extends Table_Decorator{
    public Desk(Decorator_Pattern d) {
        super(d);
    }
    @Override
    public void add(){
        super.add();
        System.out.println("Price for desk 30.99$");
    }
}
