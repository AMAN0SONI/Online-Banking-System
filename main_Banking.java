/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package online_banking_system;

import java.util.Scanner;

/**
 *
 * @author Krishnadeep Yadav
 */
public class main_Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int i;
        Sign_in s1= new Sign_in();
        Login l= new Login();
        Show_Detail sd=new Show_Detail();
        Credit c= new Credit();
        Passward_Change p = new Passward_Change();
        try{
            while(true){
            System.out.println("----WELCOME TO ONLINE BANK SYSTEM-----");
            System.out.println("1.Sign IN");
            System.out.println("2.LOGIN");
            System.out.println("3.EXIT");
            System.out.println("Enter your Choice");
            i=s.nextInt();
        
            if(i==1){
                  
                    s1.Signin();
                    
            }  
            else if (i==2){ 
                    l.Login();
                    int j=0;
                    while(j<=4){
                    System.out.println("HOME");
                    System.out.println("1.Account Detail");
                    System.out.println("2. Update Passward");
                    System.out.println("3.Credit");
                    System.out.println("4.Debit");
                    System.out.println("5.Back TO Main Menu");
                    j=s.nextInt();
                   if(j==1)
                   {
                            sd.Show();   
                   }
                   else if(j==2)
                   {
                      p.old_pass();
                   }
                   else if(j==3)
                   {
                      c.creadit();
                   }
                    else if(j==4)
                   {
                      c.debit();
                   }
                   else
                    {
                    }
                    
                }}
            else{
                if(i==3){
                     System.out.println("You Are Back");
                     System.out.println(" Thank You SO Much Visiting On Our System");
                break;}
                else
                   System.out.println("You Are Back");
               }}}
        catch(Exception e){
            System.out.println(" Error "+e);
        }}}
        
    
    

