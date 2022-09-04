package com.kwpugh.more_gems.enchantments.stupefy;

import net.minecraft.entity.Entity;

public class StupefiedEntity
{
    private Entity target;
    private int level;
    private int age;

    public StupefiedEntity(Entity target, int level, int age)
    {
        this.target = target;
        this.level = level;
        this.age = age;
    }



    public Entity getTarget()
    {
        return target;
    }

    public int getLevel()
    {
        return level;
    }

    public int getAge()
    {
        return age;
    }


    @Override
    public String toString()
    {
        return "StupefiedEntity{" +
                "target=" + target +
                ", level=" + level +
                ", age=" + age +
                '}';
    }
}

