package com.BinhAn;

public class Main {

    public static void main(String[] args) {
	StopWatch stopWatch = new StopWatch();
    long sum =0;
    for (int i =0; i<1000000000; i++) {
        for (int j = 0; j < 1000000000; j++) {
            sum += i+j;
        }
    }
    stopWatch.Stop();
    System.out.println("thời gian chạy của chương trình là"+ stopWatch.getElapsedTime()+ "ms");
    }
}
