
import java.util.Scanner;
public class Furniture_Store {
    public static void main(String[] args){
         Authorization reg = new Authorization();
         reg.authorization();
         reg.reg("Alizhan");

        Decorator_Pattern chairs_with_armrests = new Chairs_with_armrests(new Office_chair(new Dining_chairs(new Simple_Chair())));
        chairs_with_armrests.add();
        System.out.println("\n*******");

        Decorator_Pattern dining_table = new Computer_Table(new Desk(new Dining_Table(new Simple_Table())));
        dining_table.add();

        Salesman sall = new Salesman();
        new Salesman_Store(sall);
        Scanner scan = new Scanner(System.in);
        System.out.println("\nChoose a furniture: ");
        sall.setState(scan.next());

        System.out.println("Select the color and material " + "\n");
        Thread color = new Thread(new Color());
        color.start();


        Payment payment = new Payment();
        payment.setPay();
        payment.State_Pattern(scan.next());
    }
    static class Color implements Runnable{
        Scanner scan = new Scanner(System.in);
        @Override
        public void run() {
            Singleton_Pattern sp = Singleton_Pattern.getInstance(scan.next());
        }
    }
    public static class Payment{
        private String pay = "";
        public void setPay(){
            this.pay = pay;
        }
        public void State_Pattern(String next){
            System.out.println("Do you want to pay it?");
            if(pay.equalsIgnoreCase("Yes")){
                System.out.println("The payment has been succesful");
            }else if (pay.equalsIgnoreCase("No")){
                System.out.println("The payment has been denied");
            }
        }
    }

}
