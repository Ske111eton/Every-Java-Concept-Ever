package arrays;
// Brute force approach

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,1,3,-4,2};
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum == 0){
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        System.out.println("Found: " + found);
    }
}
