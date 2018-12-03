/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andreas Pc
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namabarang = null; 
        int chc=0,harga=0,idx=0,pil=0,count=0,count1=0;
        int jumlah = 0;
        Scanner data= new Scanner(System.in);
        ArrayList<String>nama= new ArrayList<>();
        ArrayList<Integer>jml= new ArrayList<>();
        ArrayList<Integer>hrg= new ArrayList<>();
        ArrayList<String>nama1= new ArrayList<>();
        ArrayList<Integer>jml1= new ArrayList<>();
        ArrayList<Integer>hrg1= new ArrayList<>();
        while(chc!=4){
        System.out.println(".:Menu:.");
        System.out.println("1.Add Barang");
        System.out.println("2.View Barang");
        System.out.println("3.Beli Barang");
        System.out.println("4.Exit");
        chc=data.nextInt();
        if(chc==1)
        {
            
                 System.out.println("Input Nama barang");
                 namabarang=data.next();
                 nama.add(namabarang);
                 System.out.println("Jumlah Barang");
                 jumlah=data.nextInt();
                 jml.add(jumlah);
                 System.out.println("Harga Barang");
                 harga=data.nextInt();
                 hrg.add(harga);
                 count++;
            
        }
        else if(chc==2)
        {
            for(int i=0;i<count;i++)
            {
            System.out.println( nama.get(i));
            System.out.println( jml.get(i));
            System.out.println( hrg.get(i)+"\n");
            }
        }
        if (chc==3)
        {
        while(pil!=4)
        {
         
        System.out.println(".:Menu:.");
        System.out.println("1.Add Barang yang akan dibeli");
        System.out.println("2.Delete Barang");
        System.out.println("3.Pembayaran barang");
        System.out.println("4.Back");
        pil= data.nextInt();
        Scanner data1=new Scanner(System.in);
            if(pil==1)
            {
                
                int ggwp,stock2;
                for(int i=0;i<count;i++){
                      System.out.printf("%d ",i+1);
                    System.out.println(  nama.get(i)+" "+jml.get(i)+" "+hrg.get(i));
                }
                System.out.println("Input pilihan: ");
                ggwp=data.nextInt();
                if(ggwp<count)
                {
                    System.out.println("Input Stock: ");
                    stock2=data.nextInt();
                    if(stock2<=jml.get(ggwp-1))
                    {
                        nama1.add(nama.get(ggwp-1));
                        jml1.add(stock2);
                        hrg1.add(hrg.get(ggwp-1)*stock2);
                        count++;
                    }
                    else
                    {
                       System.out.println("barang tidak mencukupi"); 
                    }
                }
                else 
                {
                    System.out.println("Barang tidak tersedia");
                }
                 
            }
            else if (pil==2)
            {
                int ggwp1;
                ArrayList<String>temp1= new ArrayList<>();
                ArrayList<Integer>temp2= new ArrayList<>();
                ArrayList<Integer>temp3= new ArrayList<>();
                for(int i=0;i<count1;i++)
            {
                System.out.printf("%d",i+1);
                System.out.println( nama.get(i));
            }
                System.out.println("Input pilihan:");
                ggwp1=data.nextInt();
                if (ggwp1<count1)
                {
                    for(int i=0;i<count1;i++)
                    {
                        temp1.add(nama1.get(i));
                         temp2.add(jml1.get(i));
                         temp3.add(hrg1.get(i));
                    }
                    nama1=new ArrayList<>();
                    jml1=new ArrayList<>();
                    hrg1=new ArrayList<>();
                     for(int i=0;i<count1;i++)
                     {
                         if(i!=ggwp1-1)
                         {
                             nama1.add(temp1.get(i));
                             jml1.add(temp2.get(i));
                             hrg1.add(temp3.get(i));
                         }
                     }
                     count1--;
                }
                else 
                {
                    System.out.println("Barang tidak tersedia");
                    
                }
                
                
            }
            if(pil==3)
            {
                int bayar,total=0;
                
                for(int i=0;i<count1;i++)
            {
                System.out.printf("%d",i+1);
                System.out.println( nama1.get(i)+" "+jml1.get(i)+" "+hrg1.get(i));
                total+=hrg1.get(i);
            }
                System.out.println(total);
                System.out.println("Bayar: ");
                bayar=data.nextInt();
                if(bayar>total)
                {
                    System.out.println("Kembalian:"+ (bayar-total));
                }
                for(int i=0;i<count;i++)
                {
                    for(int j=0;j<count1;j++)
                    {
                    if(nama.get(i).equals(nama1.get(j)))
                    {
                        int a=jml.get(i),b=jml1.get(j);
                        jml.set(i, a-b);
                        
                    }
                    }
                }
            }
            
            
        
        }
        }
        }
    }
    
    
}