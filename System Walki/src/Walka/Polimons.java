package Walka;

import java.util.Random;

public class Polimons
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
    private float level;
    private int stats;

    public Polimons()
    {
        Random rand = new Random();
        int elemental = rand.nextInt(3) + 0;
        name="";
        stamina=20;
        experience=0;
        level=2.0f;
        stats=0;
        
        
        switch(elemental) // W zalezności od typu polimona, otrzymuje odpowiednie staty
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

    // Gettery
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

    public String GetTypeOf()
    {
        return typeOf;
    }
    
    public int GetStats()
    {
        return stats;
    }
    
    //STOP. Settery teraz
    public void SetHp(int Hp)
    {
        HP=Hp;
    }
    
    public void SetExp(int exp)
    {
        experience+=exp;
        switch(experience)
        {
            case 40:
            {
                System.out.println("Gratulację, Twój polimon awansował na poziom 2.8");
                level=2.8f;
                stats=1;
            } break;
                
            case 80:
            {
                System.out.println("Gratulację, Twój polimon awansował na poziom 3.0");
                level=3.0f;
                stats=2;
            } break;
            
            case 160:
            {
                System.out.println("Gratulację, Twój polimon awansował na poziom 3.5");
                level=3.5f;
                stats=3;
            } break;
                
            case 320:
            {
                System.out.println("Gratulację, Twój polimon awansował na poziom 4.0");
                level=4.0f;
                stats=4;
            } break;
                
            case 640:
            {
                System.out.println("Gratulację, Twój polimon awansował na poziom 4.5");
                level=4.5f;
                stats=5;
            } break;
                
            case 1280:
            {
                System.out.println("Gratulację, Twój polimon awansował na poziom 5.0");
                level=5.0f;
                stats=6;
            } break;
        }
        System.out.print("Twój Polimon jest na poziomie " + level);
        System.out.println(". Ma w sumie już " + experience + "doświadczenia");
    }
};