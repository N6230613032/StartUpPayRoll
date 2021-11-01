public class Driver implements IPayment {

    private String name;
    private int NoOfTrip;
    private int rate;

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfTrip() {
        return NoOfTrip;
    }

    public void setNoOfTrip(int noOfTrip) {
        NoOfTrip = noOfTrip;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Driver(String name, int noOfTrip, int rate) {
        this.name = name;
        NoOfTrip = noOfTrip;
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        int payment = this.getNoOfTrip();
        return 0;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
