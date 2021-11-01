public class Developer extends Staff {

    private int codingHour;
    private int codingRate;

    public Developer(String name, int baseSalary, int overtimeHour, int overtimeRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
    }

    public Developer(String name, int baseSalary, int overtimeHour, int overtimeRate, int codingHour, int codingRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
        this.codingHour = codingHour;
        this.codingRate = codingRate;
    }

    @Override
    public int getPayment() {
        int staffsalary = super.getPayment();
        int payment = staffsalary + (this.codingHour * this.codingRate);
        System.out.println(("Develpoer payment: " + staffsalary + " plus " + (this.codingHour * this.codingRate) ));
        return payment;
    }
}
