package com.company;

enum TrafficlightColor
{
    Red, Green, Yellow
}

class TrafficLightSimulator
{
    TrafficlightColor Choise = TrafficlightColor.Red;

    public void changeColor()
    {
        switch (Choise)
        {
            case Red:
                Choise = TrafficlightColor.Green;
                break;
            case Yellow:
                Choise = TrafficlightColor.Red;
                break;
            case Green:
                Choise = TrafficlightColor.Yellow;
                break;
        }
    }

    public String toString(){return " " + Choise;}

}

public class Task_2
{
    public static void main(String[] args)
    {
        TrafficLightSimulator TL = new TrafficLightSimulator();
        for(int i = 0; i < 9; i++)
        {
            System.out.println(TL);
            TL.changeColor();
        }
    }
}
