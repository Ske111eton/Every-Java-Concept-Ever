package arrays;

public class ArrayIntro {
    public static void main(String [] args){

        /*********************** Declaring ********************/

//        int [] marks = new int[5];

        //Or

//        int[] marks;
//        marks = new int[10];

        //Or

//        int marks[] = new int[5];

        /********************* Declaring two arrays in one line ************/

//        int[] rollNos, classes;
//        rollNos = new int[5];
//        classes = new int[5];
//        System.out.println(classes[1]);

        /******************* Initializing array ***************************/

//        int [] age = {12,4,5,2,5};
//        double [] marks = {1.0, 3.14, 2.9};
//        System.out.println(marks[0]);
//        marks[0] = 33.0;
//        char [] grade = {'A', 'B', 'C'};
//        System.out.println( grade[1]);
//        System.out.println(marks[0]);

        /********************* Fetching values of array using for loop **********/

        int[] age = {1,2,3,4,5};
        for(int i=0; i<age.length; i++){
            System.out.print(age[i] + " , ");
        }
    }
}
