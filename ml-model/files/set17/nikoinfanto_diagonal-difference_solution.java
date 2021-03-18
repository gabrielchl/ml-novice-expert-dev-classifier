import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<List<Integer>> arr) {
      int rows = arr.get(0).size(), cols = arr.get(0).size();
      int primary = 0, secondary = 0;

      for(int i = 0, k = rows-1; i < rows; i++, k--)
      {
          secondary = secondary + arr.get(i).get(k);

          for(int j = 0; j < cols; j++)
          {
              if(i == j)
              {
                  primary = primary + arr.get(i).get(j);

              }
          }
      }

      return Math.abs(primary - secondary);

  }

}
