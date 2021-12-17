package de.edward;

public class Srt {

    private final int[] nmb;
                            //27543198
                            //{9, 5, 6, 7, 3, 1};
    final private int n; // = nmb.length;

    final private String nam;

    public Srt(String nm, int[] nas){
        nam = nm;
        nmb = nas;
        n = nmb.length;
    }

    //print nmb in a row //now that was difficult to figure out, wasn't it, past Edward?
    private void show(){
        System.out.print("\n ");
        for(int i=0; i<n; i++){
            System.out.print(nmb[i]+" ");
        }
    }

    //same as above expect for presentation only
    public void bShow(){
        System.out.print("\n\n Showing list of "+nam+":");
        System.out.print("\n ");
        for(int i=0; i<n; i++){
            System.out.print(nmb[i]+" ");
        }
        System.out.print("\n ");
    }

    public void sel_sort(){
        System.out.print("\n\n Initiating selection sort for "+nam);
        bShow();
        for(int i=0; i<n; i++){
            int pos_min = i;
            for(int j=i+1; j<n; j++){
                if (nmb[j]<nmb[pos_min]) {
                    pos_min = j;
                }
            }
            exch(i,pos_min);
            show();
        }
        System.out.print("\n\n Selection sort is now finished");
        lin();
    }

    //as from the copy:
    //sort the numbers, beginning wit the  smallest, using selection sort // u sure about that?
    public void ext_sel_sort(){
        System.out.print("\n\n Initiating extensive selection sort for "+nam);
        bShow();
        for(int i=0; i<n; i++){
            //as from the copy:
            //pos_min: position of the smallest number
            int pos_min = i;
            for(int j=i+1; j<n; j++){
                if (nmb[j]<nmb[pos_min]) {
                    pos_min = j;
                    System.out.print("\n "+nmb[j]+" is smaller than "+nmb[i]);
                    System.out.print("\n Smallest number now is "+nmb[pos_min]);
                }
            }
            System.out.print("\n Exchanging "+nmb[i]+" with "+nmb[pos_min]);
            exch(i,pos_min);
            show();
            System.out.print("\n "+nmb[i]+" has been engraved.");
            System.out.print("\n"); //What the hell am I doing? \n\n\n\n\n\n\n\n
        }
        System.out.print("\n\n Extensive selection sort is now finished");
        lin();
    }

    /*
    public void ins_sort(){
        System.out.print("\n\n Initiating insertion sort for "+nam); //We have to figure it out by ourselves...
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(nmb[i]>nmb[j-1]){exch(j-1,j); show();}   //TODO: This

            }
        }
    }
     */

    public void ext_bubl_sort(){
        System.out.print("\n\n Initiating extensive bubble sort for "+nam);
        bShow();
        for(int i=0; i<n; i++){

            if(i>0){
                System.out.print("\n Next");
            }                       //No, I will not... 3th it is!
            System.out.print("\n\n "+i+"th Position is now marked. (Out of "+n+" positions)\n");
            show();
            for(int j=i+1; j<n; j++){ //j=i+1 = j=1
                if(nmb[j]<nmb[i]){
                    System.out.print("\n "+nmb[j]+" is smaller than "+nmb[i]+". Swapping places...");
                    exch(j, i);
                    show();
                //TODO: This works, but not in the way it was supposed to. What in the name of fuck?
                } else {
                    System.out.print("\n "+nmb[j]+" is bigger than "+nmb[i]+". No changes."); //Did I just accidentally create an insertion sorter?
                    show();
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n Extensive bubble sort is now finished");
        lin();
    }

    public void bubl_sort(){
        System.out.print("\n\n Initiating bubble sort for "+nam);
        bShow();
        //System.out.print("\n");
        for(int i=0; i<n; i++){
            System.out.print("\n ");
            spc(i-1);
            System.out.print("M");
            show();
            for(int j=i+1; j<n; j++){
                if(nmb[j]<nmb[i]){
                    exch(j, i);
                    show();
                }
            }   //What black magic fuckery is this? Why does this work all of a sudden? I practically just banged my head against the keyboard!
        }
        System.out.print("\n\n Bubble sort is now finished");
        lin();
    }

    public void sal(){
        System.out.print("\n\n Merry Christmas");//bnhd wnkr
    }

    private void exch(int a, int b) {
        int c = nmb[a];
        nmb[a] = nmb[b];
        nmb[b] = c; //Did we forget about exchanging two variables without the use of a third one?
    }

    private void lin(){
        System.out.print("\n\n>------------------------------------<");
    }           //The divine powers forced me to do this! No soul left untouched!

    private void spc(int i){
        for(int j = 0; j <= i; j++){
            System.out.print("  "); //Because pressing the space bar couldn't have been more daunting
        }
    }

}

//TODO: CLEAN THIS MESS UP