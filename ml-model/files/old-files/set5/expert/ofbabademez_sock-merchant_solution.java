import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] arr) {
        int ret = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j] && arr[i] != -1){
                    arr[i] = -1;
                    arr[j] = -1;
                    ret++;
                }
            }
        }
        return ret;

    }

}
