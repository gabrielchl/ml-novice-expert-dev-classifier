import java.util.*;

public class Solution {

    public static int getRoundedGrade(int grade) {
        if (grade >= 38) {
            int mod5 = grade % 5;
            if (mod5 > 2) {
                grade += 5 - mod5;
            }
        }

        return grade;
    }

}
