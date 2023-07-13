/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_banking_system;

/**
 *
 * @author Krishnadeep Yadav
 */
import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;
public class Transaction {
    Scanner s= new Scanner (System.in);
    FileWriter fileWriter = null;
    FileReader filereader=null;
    void account_detail(){
        try{
           
              fileWriter = new FileWriter("E:\\filename.txt");
              filereader= new FileReader("E:\\filename.txt");
              
             
         
           
            System.out.println("Enter A User Account No. ");
            int i=s.nextInt();
            System.out.println("Enter A User IFSC No. ");
            int j=s.nextInt();
            System.out.println("Enter A User Name ");
            String name=s.next();
    
           
           
           
            
            
           
            fileWriter.write(Integer.toString(i));
            fileWriter.write(Integer.toString(j));
            fileWriter.write(name);
            
            int k=0;
            while((k=filereader.read())!=-1)
            {
                System.out.println((char)i);
            }
            filereader.close();
            
            
        
            
        }
        catch(IOException e){
             e.printStackTrace();
        }
         finally {
            try 
            {
                if (fileWriter != null && filereader!=null)
                {
                    fileWriter.close();
                    filereader.close();
                }
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
       
    }
    public static void main(String []args)
    {
        Transaction t= new Transaction();
        t.account_detail();
    }
    
    
}
