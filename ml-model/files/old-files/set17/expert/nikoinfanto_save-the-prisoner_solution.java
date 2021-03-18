import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int m, int s) {

        int poisonedPrisoner = (s + m - 1) % n;
        if(poisonedPrisoner == 0){poisonedPrisoner=n;}
        return poisonedPrisoner;
    }

}
