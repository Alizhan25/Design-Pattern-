public class Table_Decorator implements Decorator_Pattern{
    protected Decorator_Pattern decorator;
    public Table_Decorator(Decorator_Pattern d){
        this.decorator = d;
    }
    @Override
    public void add() {
        this.decorator.add();
    }
}
