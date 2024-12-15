import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
    long min,max,s=0;
    Collections.sort(arr);
    int n=arr.size();
    for(int i=0;i<n;i++)
    s+=arr.get(i);
    System.out.println((s-arr.get(n-1))+" "+(s-arr.get(0)));
    }

}
