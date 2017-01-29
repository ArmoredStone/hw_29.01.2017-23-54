package com.company;

public class Shark extends Fish
{


    public Shark()
    {
        super();
    }

    public void eat(Fish victim)
    {
        victim.die();
    }
}
