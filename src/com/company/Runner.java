package com.company;

public class Runner extends Thread {
    private Runner runnerPrevious;
    private Runner runnerNext;

    public Runner(String name) {
        super(name);
    }
    public void setRunners(Runner runnerBefore, Runner runnerAfter) {
        this.runnerPrevious = runnerBefore;
        this.runnerNext = runnerAfter;
    }
    @Override
    public synchronized void run() {
        try {
            System.out.println(getName() + " берет палочку");
            if (getName().equals("runner5")) {
                System.out.println(getName() + " бежит к финишу");
                System.out.println(getName() + " бежит к " + runnerPrevious.getName());
                sleep(5000);
            } else {
                System.out.println(getName() + " бежит к " + runnerNext.getName());
                sleep(5000);
                runnerNext.start();
                runnerNext.join();//repeat before 5th    narrow hall
            }
            System.out.println(getName() + " берет палочку");
            if (!getName().equals("runner1")) {
                System.out.println(getName() + " бежит к " + runnerPrevious.getName());
                sleep(5000);
            } else
                System.out.println("забег окончен");

        } catch (Exception ignore) {
        }
    }
}
