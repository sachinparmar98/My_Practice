/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynetbeanpractice;

/**
 *
 * @author SHIVA
 */
public class MyNetBeanPractice {

    /**
     * @param args the command line arguments
     */
  
        // TODO code application logic here
        public static void main(String ar[])
   {
   int i,j;
   for(i=1;i<=5;i++)
   {
   for(j=1;j<=i;j++)
   {
       try
       {
        Thread.sleep(500);
       }
       catch(Exception e)
       {
           Sysytem.out.println("ram ram");
       }
   System.out.print("* ");
   }
   System.out.println();
   }
   }
    }
    

