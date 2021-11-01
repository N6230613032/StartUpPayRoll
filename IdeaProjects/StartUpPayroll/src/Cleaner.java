public class Cleaner implements IPayment{

    private String name;
    private int dayOfWork;
    private int rate;


    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfWork() {
        return dayOfWork;
    }

    public void setDayOfWork(int dayOfWork) {
        this.dayOfWork = dayOfWork;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Cleaner(String name, int dayOfWork, int rate) {
        this.name = name;
        this.dayOfWork = dayOfWork;
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        int payment = this.dayOfWork * this.rate;
        return payment;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
