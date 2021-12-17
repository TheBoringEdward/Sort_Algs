package de.edward;

//import java.util.Scanner;

public class Sorts {

    //Scanner scn2 = new Scanner(System.in); //I'm waiting

    int[] par  = {2,7,5,9,4,3,1,8,6}; //This seems like a terrible way of doing this.
    int[] par1 = {2,7,5,9,4,3,1,8,6};
    int[] par2 = {4,8,1,9,5};
    int[] par3 = {2,7,5,9,4,3,1,8,6};//27543198
                            //{9, 5, 6, 7, 3, 1};
                            //4,8,1,9,5

    final Srt s1 = new Srt("s1", par);
    final Srt s2 = new Srt("s2", par1);
    final Srt s3 = new Srt("s3", par2);
    final Srt s4 = new Srt("s4", par3);

    public void play(){

        //Sorting algorithms...
        //Great

        System.out.print("\n\n Debugging...\n");

        s4.ext_sel_sort();


        s1.sel_sort();


        s3.ext_bubl_sort();


        s2.bubl_sort();


        s3.sal();

        System.out.print("\n\n Debugging finished");

    }
    public static void main(String [] args){
        Sorts me = new Sorts();
        me.play(); //Don't fully understand why my teacher always "wants" us to do it like this. It works, but... Just why? Possibly some shenanigans that I am unaware of.
        System.out.print("\n\n -- This code has been provided by TheBoringEdward with the help of a great fellow -- \n\n");
    }
}

//      This code has been provided by TheBoringEdward with the help of a great fellow
//      This code is under the license of the Unlicense
//      Cheers