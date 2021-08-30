package sortingAlgorithms;

public class BubbleSort {
    public static void main(String [] args){
        int [] a = {7,5,4,2,0};
        int n = a.length;

        for(int i=0; i<n-1; i++){
            boolean sorted = true;
            for(int j=0; j<n-1-i; j++){
                  if(a[j+1]<a[j]){
                      int temp = a[j+1];
                      a[j+1] = a[j];
                      a[j] = temp;
                      sorted = false;
                  }
            }
            if(sorted)
                break;
        }

        for(int items : a){
            System.out.print(items + "  ");
        }

    }
}
