package org.example.lesson_20_04;

public class Salary {
    private int sum;
    private String currency;

    public Salary(int sum, String currency) {
        this.sum = sum;
        this.currency = currency;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "sum=" + sum +
                ", currency='" + currency + '\'' +
                '}';
    }




    // constructor +
    //get /set +
    //toString
}
