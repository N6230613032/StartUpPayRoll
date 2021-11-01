public class Internet implements IPayment{

    private String name;
    private int monthly;
    private int rate;

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthly() {
        return monthly;
    }

    public void setMonthly(int monthly) {
        this.monthly = monthly;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Internet(String name, int monthly, int rate) {
        this.name = name;
        this.monthly = monthly;
        this.rate = rate;
    }
    @Override
    public int getPayment() {
        int payment = this.monthly * this.rate;
        return payment;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
