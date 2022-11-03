import java.util.List;
import java.util.ArrayList;
abstract class Observer_Pattern {
    protected Salesman sall;
    public abstract void update();
}
    class Salesman {
        private List<Observer_Pattern> observers = new ArrayList<>();
        private String state;

        public void add(Observer_Pattern op) {
            observers.add(op);
        }

        public String getState() {
            return state;
        }

        public void setState(String value) {
            this.state = value;
            execute();
        }

        private void execute() {
            for (Observer_Pattern op : observers) {
                op.update();
            }
        }
    }
    class Salesman_Store extends Observer_Pattern{
        public Salesman_Store(Salesman sall){
            this.sall = sall;
            this.sall.add(this);
        }
        @Override
        public void update() {
              System.out.println("You choosed a simple chair");
              System.out.println("\nThe price is $21.99." );
        }

    }

