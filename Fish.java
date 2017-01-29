package com.company;

public class Fish {

    private int age;
    private String color;
    private boolean isAlive;

    public Fish() {
        age = 1;
        color = "gray";
        isAlive = true;
    }

    public void swim() {
        System.out.println("The " + color + " fish is swimming....");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void die() {
        isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
