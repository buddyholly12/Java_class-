/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andreas Pc
 */
public class PR_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int loops=0,chc=0;
        Scanner input= new Scanner(System.in);
        ArrayList<kendaraan>Car= new ArrayList<>();
        ArrayList<kendaraan>Ship= new ArrayList<>();
        while(loops!=4){
            System.out.println(".:MENU:.");
            System.out.println("1.Buat Kendaraan");
            System.out.println("2.Lihat Kendaraan");
            System.out.println("3.Cari Kendaraan");
            System.out.println("4.Exit");
            loops=input.nextInt();
            if(loops==1){
                while(chc!=3){
                    String nama,nama1 = null;
                    double maxspeed,currentspeed,maxweight,currweight;
                    int arr=0,arr1=0,arr2=0;
                    Scanner input1= new Scanner(System.in);
                    System.out.println(".:MENU:.");
                    System.out.println("1.Mobil");
                    System.out.println("2.kapal");
                    System.out.println("3.Back");
                    chc=input.nextInt();
                    if(chc==1)
                    {
                        Car.add(new Car());
                        System.out.println("Input nama:");
                        nama=input1.next();
                        Car.get(arr).setName(nama);
                        System.out.println("Input Maxspeed:");
                        maxspeed=input1.nextDouble();
                        Car.get(arr).setMaxSpeed(maxspeed);
                        System.out.println("Input Current speed:");
                        currentspeed=input1.nextDouble();
                        Car.get(arr).setCurrSpeed(currentspeed);
                    }
                    else if(chc==2)
                    {
                        Ship.add(new Ship());
                        System.out.println("Input nama:");
                        nama=input1.next();
                        Ship.get(arr1).setName(nama1);
                        System.out.println("Input MaxWeight:");
                        maxweight=input1.nextDouble();
                        Ship.get(arr1).getmaxweight(maxweight);
                        System.out.println("Input Current weight:");
                        currweight=input1.nextDouble();
                        Ship.get(arr1).setCurrentWeight(currweight);

                    }
                }
            }
            else if (loops==2){
                for(int i=0;i<Car.size();i++){
                    Car.get(i).drive();     
                }
                for(int i=0;i<Ship.size();i++)
                {
                    Ship.get(i).loaditems();
                     
                }
         
            }
            if(loops==3)
            {
            
            }
     
        }
    }
}
