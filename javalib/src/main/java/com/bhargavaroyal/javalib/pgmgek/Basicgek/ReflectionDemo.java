package com.bhargavaroyal.javalib.pgmgek.Basicgek;

import java.lang.reflect.Constructor;

public class ReflectionDemo {
    private String name;
    ReflectionDemo()
    {
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public static void main(String[] args)
    {
        try
        {
            Constructor<ReflectionDemo> constructor
                    = ReflectionDemo.class.getDeclaredConstructor();
            ReflectionDemo r = constructor.newInstance();
            r.setName("GeeksForGeeks");
            System.out.println(r.name);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
