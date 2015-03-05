/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walka;

import java.util.Random;

public class Polimon
{
    public enum type{fire,water,earth}

    private type elemental;
    private String name;
    private int attack;
    private int defence;
    private int HP;
    private int stamina;
    private int experience;
    private int lvl;
    private int a;

    public Polimon()
    {
        Random rand = new Random();
        int elemental = rand.nextInt(3) + 0;
        name="";
        stamina=20;
        experience=0;
        lvl=1;
        a = elemental; 
        switch(elemental)
        {
            case 0:
            {
                attack=12;
                defence=5;
                HP=100;
            } break;

            case 1:
            {
                attack=10;
                defence=10;
                HP=100;
            } break;

            case 2:
            {
                attack=10;
                defence=5;
                HP=125;
            } break;
        }
    }

    public int GetAttack()
    {
        return attack;
    }
    public int GetDefence()
    {
        return defence;
    }
    public int GetHP()
    {
        return HP;
    }

    public void SetHp(int Hp)
    {
        HP=Hp;
    }
    public int GetType()
    {
        return a;
    }

    public void SetName()
    {

    }
};