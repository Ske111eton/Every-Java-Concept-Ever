package arrays;

// Arrays of longs are fine: long[].
// But all arrays are int-indexed.
// So just change long n to int n in the
// method parameter declaration, and you'll be all set.

import java.util.Arrays;

class Solutions {
    public long[] findElements( long a[], long n)
    {
        int size = (int)n-2; //We should convert long to int first.
        long [] res = new long[size];
        Arrays.sort(a);

        for(int i=0; i<size; i++){
            res[i] = a[i];
        }
        return res;
    }
}

public class LongToInt {
    public static void main(String[] args) {
    }
}
