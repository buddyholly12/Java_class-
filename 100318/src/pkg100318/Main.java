/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100318;

import java.util.ArrayList;

/**
 *
 * @author Andreas Pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int data[]={1,2,3};
//        for(int i=0;i<data.length;i++)
//        {
//            System.out.println(data[i]);
//        }
//        int data1[]= new int[3];
//        for(int i=0;i<data1.length;i++)
//        {
//            data1[i]=i+1;
//            System.out.println(data[i]);
//        }
//        ArrayList<Integer>listdata= new ArrayList<>();
//        for(int i=0;i<10;i++)
//        {
//            listdata.add(i);
//        }
//        Integer find =new Integer(5);
//        listdata.remove(find);
//         for(int i=0;i<listdata.size();i++)
//         {
//             System.out.print(listdata.get(i));
//         }
//         Data_mhs siswa = new Data_mhs("aaaaa","12345",2016);
//         System.out.print(siswa);
//   
//    Cirlce lingkaran = new Cirlce(10);
//    lingkaran.print();
//    Rect kotak= new Rect(11,1);
//    kotak.print();
//    Toyota mobil =new Toyota ();
//    mobil.print();
//     Car mobil1 =new Car()
//     {
//        @Override
//        public void print() {
//            System.out.println("mobil1");
//        }
//     };
//       mobil1.print();
   cylinder silinder = new cylinder(1.0,2.5,"red");
   silinder.print();
   Circle b=new Circle(3.5,"blue");
   System.out.println(silinder);
   System.out.println(b);
   }
    
}
