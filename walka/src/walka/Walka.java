/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walka;

import java.util.Random;

/**
 *
 * @author Repay
 */
public class Walka {

        public static void walka(Polimon A,Polimon B)
    {
        int pol = 1;
        System.out.println("A = " + A.GetType() + " B =" +B.GetType());
        do
        {
            Random rand = new Random();
            int dmgA = (rand.nextInt(A.GetAttack()) + 0);
            int dmgB = (rand.nextInt(B.GetAttack()) + 0); 
            int obronaA = (rand.nextInt(A.GetDefence()) + 0) ;
            int obronaB = (rand.nextInt(B.GetDefence()) + 0) ;
            if(pol == 1)
            {
                if(obronaA>dmgB ) continue;
                else
                A.SetHp( A.GetHP()- (dmgB-obronaA) );
                pol = 0;
                System.out.println("dmgB = " + dmgB + " pozostale hp A =" +A.GetHP());
            }
            else 
            {
                if(obronaB>dmgA) continue;
                else
                B.SetHp( B.GetHP()- (dmgA-obronaB) );
                pol = 1;
                System.out.println("dmgA = " + dmgA + " pozostale hp B =" +B.GetHP());
            }
        }while(A.GetHP()>0 && B.GetHP() >0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polimon A = new Polimon();
        Polimon B = new Polimon();
        walka(A,B);
    }
    
}
