public class Marketing extends Staff{

    private int lang;
    private int count;

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public Marketing(String name, int baseSalary, int overtimeHour, int overtimeRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
    }
    public Marketing(String name, int baseSalary, int overtimeHour, int overtimeRate, int lang, int count) {
        super(name, baseSalary, overtimeHour, overtimeRate);
        this.count = count;
        this.lang = lang;
    }

    @Override
    public int getPayment() {
        int staffsalary = super.getPayment();
        int payment = staffsalary + (this.lang * this.count);
        System.out.println(("Marketing payment: " + staffsalary + " plus " + (this.lang * this.count) ));
        return payment;
    }
}
