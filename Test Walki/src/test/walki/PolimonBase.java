package test.walki;

import java.util.Random;

public class PolimonBase
{
    public enum type{fire,water,earth}

    private type elemental;
    private String name;
    private String typeOf;
    private int attack;
    private int defence;
    private int HP;
    private int stamina;
    private int experience;
    private int lvl;
    
    //private int a;

    public PolimonBase()
    {
        Random rand = new Random();
        int elemental = rand.nextInt(3) + 0;
        name="";
        stamina=20;
        experience=0;
        lvl=1;
        //a = elemental; 
        switch(elemental)
        {
            case 0:
            {
                attack=7;
                defence=5;
                HP=80;
                typeOf="fire";
            } break;

            case 1:
            {
                attack=5;
                defence=7;
                HP=80;
                typeOf="water";
            } break;

            case 2:
            {
                attack=5;
                defence=5;
                HP=100;
                typeOf="earth";
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
    public String GetTypeOf()
    {
        return typeOf;
    }
};