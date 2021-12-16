package de.edward;

//import java.util.Scanner;

public class Sorts {

    //Scanner scn2 = new Scanner(System.in);

    int par[] = {4,8,1,9,5}; //This seems like a terrible way of doing this.
    int par1[] = {3, 2, 4};
    int par2[] = {3, 2, 4};

    final Srt s1 = new Srt("s1", par);
    final Srt s2 = new Srt("s2", par1);
    final Srt s3 = new Srt("s3", par2);

    public void play(){

        //Sorting algorithms...
        //Great

        System.out.print("\n\n Debugging... \n");

        s1.bShow();
        s1.sel_sort();

        /*
        s2.bShow();
        s2.ins_sort();
        s3.bShow();
        s3.bubl_sort();
         */

        System.out.print("\n\n Debugging end");

    }
    public static void main(String [] args){
        Sorts me = new Sorts();
        me.play(); //Don't fully understand why my teacher always "wants" us to do it like this. It works, but... Just why? Possibly some shenanigans that I am unaware of.
        System.out.print("\n\n --This code has been provided by TheBoringEdward with the help of a great fellow-- \n\n");
    }
}

//      This code has been provided by TheBoringEdward with the help of a great fellow
//      This code is under the license of the Unlicense
//      Cheers