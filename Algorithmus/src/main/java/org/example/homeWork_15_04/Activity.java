package org.example.homeWork_15_04;

class Activity {
    String name;
    int start;
    int finish;
    int sum;

    public Activity(String name, int start, int finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
        this.sum = calculateProfit(start, finish);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private int calculateProfit(int start, int finish) {
        if (finish <= 13) {
            return 1;
        } else if (start >= 13) {
            return 2;
        } else {
            return finish > 13 ? 2 : 1;
        }
    }
}
