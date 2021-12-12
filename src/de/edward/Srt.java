package de.edward;

public class Srt {

    final private int[] nmb = {9, 5, 6, 7, 3, 1};
                            //27543198
    final private int n = nmb.length;

    final private String nam;

    public Srt(String nm){
        nam = nm;
    }

    //print nmb in a row
    public void show(){
        System.out.print("\n ");
        for(int i=0; i<n; i++){
            System.out.print(nmb[i]+" ");
        }
    }

    public void bShow(){
        System.out.print("\n\n Showing numbers of "+nam);
        System.out.print("\n ");
        for(int i=0; i<n; i++){
            System.out.print(nmb[i]+" ");
        }
    }

    //as from the copy:
    //sort the numbers, beginning wit the  smallest, using selection sort
    public void sel_sort(){
        System.out.print("\n\n Initiating selection sort for "+nam);
        for(int i=0; i<n; i++){
            //as from the copy:
            //pos_min: position of the smallest number
            int pos_min = i;
            for(int j=1; j<n; j++){
                if (nmb[j]<nmb[i]) {pos_min = j;}
            }
            exch(i,pos_min);
            show();
        }
    }

    public void ins_sort(){
        System.out.print("\n\n Initiating insertion sort for "+nam); //We have to figure it out by ourselves...
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(nmb[i]>nmb[j-1]){exch(j-1,j); show();}

            }
        }
    }

    public void bubl_sort(){
        System.out.print("\n\n Initiating bubble sort for "+nam);
        for(int i=1; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nmb[j]<nmb[j]){
                    exch(i, j);
                    show();
                }
                System.out.print("\n");
            }
        }
    }

    private void exch(int a, int b) {
        int c = nmb[a];
        nmb[a] = nmb[b];
        nmb[b] = c; //Did we forget about exchanging two variables without a third?
    }

}