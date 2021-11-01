import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	 //write your code here

        Developer devl = new Developer("Ronnakron", 10000, 2, 500, 12, 1000);
        Ceo ceol = new Ceo("Nattapong", 110000, 2, 500, 5,1500);
        Marketing marketingl = new Marketing("Oil", 25000, 12, 500,10,20);
        Driver driverl = new Driver("arm",2,500);
        Cleaner cleanerl = new Cleaner("sim",30,22);
        Rental rental = new Rental("rent",2,1500);
        Electricity electricityl = new Electricity("El",5303,7);
        Internet internetl = new Internet("True",3,3000);

        int totalPayment = 0;

        ArrayList<IPayment> costfix = new ArrayList<IPayment>();
        costfix.add(devl);
        costfix.add(ceol);
        costfix.add(marketingl);
        costfix.add(driverl);
        costfix.add(cleanerl);
        costfix.add(rental);
        costfix.add(electricityl);
        
        
        for (IPayment cost : costfix) {
            int payment = cost.getPayment();
            System.out.println(cost.getName() + " Payment: " + payment );
            totalPayment += payment;
        }
        System.out.println("Total payment: " + totalPayment);
    }
}
