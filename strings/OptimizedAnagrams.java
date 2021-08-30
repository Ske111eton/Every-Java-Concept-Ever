/*                Using Array                      */

package strings;

public class OptimizedAnagrams {
    public static void main(String[] args) {
        String a = "aab";
        String b = "aba";
        boolean isAnagram = true;

        int[] arr = new int[256];

        for(char c: a.toCharArray()) {
            int index = (int) c;
            arr[index]++;
        }
        for(char c: b.toCharArray()) {
            int index = (int) c;
            arr[index]--;
        }

        for(int i=0; i<256; i++){
            if(arr[i] != 0){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagram !!! ");
        }
        else{
            System.out.println("Not Anagram !!! ");
        }
    }
}
