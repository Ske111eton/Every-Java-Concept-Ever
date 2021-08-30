package multiDimensionalArrays;



public class LengthOf2DArray {
    public static void main(String[] args) {


        int[][] arr = new int[10][5];

        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println(rows + " " + cols);
    }
}
