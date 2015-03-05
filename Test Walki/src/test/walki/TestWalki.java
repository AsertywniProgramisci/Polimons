/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.walki;

import java.util.Random;

public class TestWalki 
{        
    public static void walka2(PolimonBase A,PolimonBase B)
    {
        Random rand = new Random();
        int damageA=0; //Cała wartość ataku polimona A na turę
        int damageB=0; //Cała wartość ataku polimona B na turę
        
        int defenceA=0; // Cała wartość obrony polimona A na turę
        int defenceB=0; // Cała wartość obrony polimona B na turę
        
        int bonusA=0; //Premia do statów dla A przy walce z róznymi typami
        int bonusB=0; //Premia do statów dla B przy walce z róznymi typami
        int player=0; // Zmienna do określania kolejności ruchów
        
        switch(A.GetTypeOf())
            {
                case "fire": // Gdy polimon A jest ognisty
                {
                    if(B.GetTypeOf().contains("earth")) // Vs roślinnemu dostaje 2 bonusu
                    {
                        bonusA=2;
                        bonusB=0;
                    }
                    else if(B.GetTypeOf().contains("water")) // Vs wodnemu straci 1 bonusu
                    {
                        bonusA=0;
                        bonusB=2;
                    }
                    else // Gdy oboje ogniste - nic
                    {
                        bonusA=0;
                        bonusB=0;
                    }
                }break;
                    
                case "water": // Gdy polimon A jest wondy 
                {
                    if(B.GetTypeOf().contains("earth")) // Vs roślinnemu straci 2 bonusu
                    {
                        bonusA=0;
                        bonusB=2;
                    }
                    else if(B.GetTypeOf().contains("fire")) // Vs ognistemu dostaje 1 bonusu
                    {
                        bonusA=2;
                        bonusB=0;
                    }
                    else // Gdy oboje ogniste - nic
                    {
                        bonusA=0;
                        bonusB=0;
                    }
                }break;
                    
                case "earth": // Gdy polimon A jest roslinny
                {
                    if(B.GetTypeOf().contains("fire")) // Vs roślinnemu straci 2 bonusu
                    {
                        bonusA=0;
                        bonusB=2;
                    }
                    else if(B.GetTypeOf().contains("water")) // Vs wodnemu dostaje 2 bonusu
                    {
                        bonusA=2;
                        bonusB=0;
                    }
                    else // Gdy oboje ogniste - nic
                    {
                        bonusA=0;
                        bonusB=0;
                    }
                }break;
            }
        
        do{
            damageA = (rand.nextInt(A.GetAttack() + bonusA + 1) + 0);
            damageB = (rand.nextInt(B.GetAttack() + bonusB + 1) + 0);
            
            defenceA = (rand.nextInt(A.GetDefence()+1) + 0) ;
            defenceB = (rand.nextInt(B.GetDefence()+1) + 0) ;
            
            if(player == 0)
            {
                if(defenceA>damageB) 
                    continue;
                else
                {
                    A.SetHp( A.GetHP()- (damageB-defenceA));
                    player = 1;
                    //System.out.println("dmgB = " + damageB + " pozostale hp A =" +A.GetHP());
                }
            }
            else 
            {
                if(defenceB>damageA) 
                    continue;
                else
                {
                    B.SetHp( B.GetHP()- (damageA-defenceB) );
                    player = 0;
                    //System.out.println("dmgA = " + damageA + " pozostale hp B =" +B.GetHP());
                }
            }
        }while(A.GetHP() > 0 && B.GetHP() > 0);
        System.out.println();
        System.out.println("Dmg A: " + damageA);
        System.out.println("Dmg B: " + damageB);
        System.out.println();
        System.out.println("Deff A: " + defenceA);
        System.out.println("Deff B: " + defenceB);
    }

    public static void main(String[] args) {
        PolimonBase A = new PolimonBase();
        PolimonBase B = new PolimonBase();
        
        System.out.println("Polimon A:");
        System.out.println("Typ: " + A.GetTypeOf());     
        System.out.println("Attack: " + A.GetAttack());
        System.out.println("Deff: " + A.GetDefence());
        System.out.println("HP: " + A.GetHP());
        System.out.println();
        System.out.println("Polimon B:");
        System.out.println("Typ: " + B.GetTypeOf());
        System.out.println("Attack: " + B.GetAttack());
        System.out.println("Deff: " + B.GetDefence());
        System.out.println("HP: " + B.GetHP());
        
        walka2(A,B);
    }
    
}