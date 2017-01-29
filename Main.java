package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        List<Fish> fishy = new ArrayList<>();
        Fish fish = new Fish();
        for (int i = 0; i <= 20; i++) {
            fishy.add(fish);
        }
        for (int i = 0; i <= 20; i++) {
            fishy.get(i).setColor("blue");
        }
        fishy.get(7).setColor("green");
        fishy.get(7).swim();
        Fish x = fish;
        fishy.add(x);
        fishy.remove(fishy.size() - 1);
        Fish nemo = fish;
        fishy.add(nemo);
        fishy.get(1).setColor("purple");
        fishy.get(2).setColor("yellow");
        fishy.get(6).setColor("magenta");
        fishy.get(13).setColor("cyan");
        fishy.get(16).setColor("navy");
        Fish a = new Fish();
        Fish b = new Fish();
        Fish c = new Fish();
        fishy.add(a);
        fishy.add(0, b);
        System.out.println(fishy.size() / 2);
        fishy.add((fishy.size() - 1) / 2, c);
        System.out.println(fishy.size());
        for (int i = 0; i < fishy.size() - 1; i++) {
            fishy.get(i).setAge((int) (Math.random() * 60));
            System.out.println(fishy.get(i).getAge());
        }
        for (int i = 0; i < 5; i++) {
            int l = (int) (Math.random() * (fishy.size() - 1));
            fishy.remove(l);
        }
        for (int i = 0; i < fishy.size(); i++) {
            System.out.println(fishy.get(i).getAge());
            System.out.println(fishy.get(i).getColor());
        }
        for (int i = 0; i < fishy.size(); i++) {
            if ((fishy.get(i).getAge() > 40)) {
                fishy.get(i).die();
            }
        }
        for (int i = 0; i < fishy.size(); i++) {
            if (fishy.get(i).isAlive()) {
                System.out.println(fishy.get(i).getColor());
                System.out.println(fishy.get(i).getAge());
            }
        }
        System.out.println("------");
        for (int i = 0; i < fishy.size(); i++) {
            if (!fishy.get(i).isAlive()) {
                System.out.println(fishy.get(i).getColor());
                System.out.println(fishy.get(i).getAge());
            }
        }
        List<Fish> theGreatBeyond = new ArrayList<Fish>();
        for (int i = 0; i < fishy.size(); i++) {
            if (!fishy.get(i).isAlive()) {
                theGreatBeyond.add(fishy.get(i));
            }
        }
        for (int i = 0; i < 5; i++) {
            theGreatBeyond.add(fish);
        }
        System.out.println("------");
        Shark shark = new Shark();
        Shark jaws = shark;
        for (int i = 0; i < fishy.size(); i++) {
            if (Objects.equals(fishy.get(i).getColor(), "blue")) {
                fishy.get(i).die();
            }
        }
        for (int i = 0; i < 5; i++) {
            fishy.add((int) (Math.random() * 5), shark);
        }
        for (int i = 0; i < fishy.size(); i++) {
            if (fishy.get(i) != shark) {
                System.out.println(fishy.get(i).getColor());
                System.out.println(fishy.get(i).getAge());

            } else {
                System.out.println("AHTUNG it's a shark");
                break;
            }
        }
        for (int i = 0; i < fishy.size(); i++) {
            if (fishy.get(i) instanceof Shark) {
                System.out.println("shark");
            } else if (fishy.get(i) instanceof Fish) {
                System.out.println("fish");
            }
        }
        for (int i = 0; i < fishy.size(); i++) {
            if (fishy.get(i) instanceof Shark) {
                System.out.println("AHTUNG shark, creating a new fish to feed it!");
                fishy.add(fish);
                fishy.get(fishy.size()-1).die();
            }
        }



    }
}
