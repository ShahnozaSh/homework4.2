package com.company;

public class Main {

    public static void main(String[] args) {
		Runner runner1 = new Runner("бегун 1");
		Runner runner2 = new Runner("бегун 2");
		Runner runner3 = new Runner("бегун 3");
		Runner runner4 = new Runner("бегун 4");
		Runner runner5 = new Runner("бегун 5");

		runner1.setRunners(runner5, runner2);
		runner2.setRunners(runner1, runner3);
		runner3.setRunners(runner2, runner4);
		runner4.setRunners(runner3, runner5);
		runner5.setRunners(runner4, runner1);

		runner1.start();
    }

}
