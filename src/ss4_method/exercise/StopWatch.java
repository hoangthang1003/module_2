package ss4_method.exercise;

public class StopWatch {
    long starTime,stopTime;
    public StopWatch(long starTime,long stopTime) {
        this.starTime = starTime;
        this.stopTime = stopTime;
    }

    public long getStarTime() {
        return starTime ;
    }

    public long getStopTime() {
        return stopTime;
    }
}
