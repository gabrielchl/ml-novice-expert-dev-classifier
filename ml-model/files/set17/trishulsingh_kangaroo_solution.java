import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        String response = "NO";
boolean canCatchUp = (v2 < v1);
if(canCatchUp) {
    boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
    if(willIntersectOnLand) {
        response = "YES";
    }
}

return response;

    }

}
