public class Chair_Decorator implements Decorator_Pattern{
    protected Decorator_Pattern decorator;
    public Chair_Decorator(Decorator_Pattern d){
        this.decorator = d;
    }
    @Override
    public void add() {
      this.decorator.add();
    }
}
