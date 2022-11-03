public class Computer_Table extends Table_Decorator{
    public Computer_Table(Decorator_Pattern d) {
        super(d);
    }
    @Override
    public void add(){
        super.add();
        System.out.println("Price for computer table 51.99$");
    }
}
