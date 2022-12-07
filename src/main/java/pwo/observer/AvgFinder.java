package pwo.observer;

import pwo.observer.Publisher.Subscriber;

public class AvgFinder implements Subscriber {

    Integer avg = null;
    Integer i = 0;
    Integer sum = null;

    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
        i++;
        if(i==3){
            avg= sum/3;
        }
    }

    public int getAvg() {
        return avg;
    }
}