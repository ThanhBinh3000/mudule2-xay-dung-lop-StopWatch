package com.BinhAn;

public class StopWatch {
    private  long startTime;
    private  long endTime;


    // ALT = Insert của mac là ommand + N
    public StopWatch(){
        this.startTime = System.currentTimeMillis();

    }
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void  Start(){
        this. startTime = System.currentTimeMillis();

    }
    public void Stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
