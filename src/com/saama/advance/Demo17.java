package com.saama.advance;

class Overload
{
    public int x;
    public int y;

    public void add(int a)
    {
        x = a + 1;
    }

    public void add(int a, int b)
    {
        x = a + 2;
    }
}
public class Demo17
{
    public static void main(String[] args)
    {
        Overload obj = new Overload();
        int a = 0;
        obj.add(6);
        System.out.println(obj.x);
    }
}
