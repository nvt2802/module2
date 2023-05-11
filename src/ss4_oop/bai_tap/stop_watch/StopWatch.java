package ss4_oop.bai_tap.stop_watch;

import java.util.Date;

public class StopWatch {

    long miliSecondsStart;
    long miliSecondsEnd;
    private Date startTime;

    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
        this.endTime = new Date();
    }

    public long start() {
        this.miliSecondsStart = System.currentTimeMillis();
        this.startTime = new Date(miliSecondsStart);
        return this.miliSecondsStart;
    }

    public long stop() {
        this.miliSecondsEnd = System.currentTimeMillis();
        this.endTime = new Date(miliSecondsEnd);
        return this.miliSecondsEnd;
    }

    public long getElapsedTime() {
        return this.miliSecondsEnd-this.miliSecondsStart;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
