package strings;

public class ConcatAndReverse {
    public static void main(String [] args){
        String s1 = "Alan";
        String s2 = "Walker";

        String result = s1.concat(s2);

        char [] arr = result.toCharArray();
        String output =" ";
        for(int i=arr.length-1; i>=0; i--){
            output += arr[i];
        }
        System.out.println(output);
    }
}
