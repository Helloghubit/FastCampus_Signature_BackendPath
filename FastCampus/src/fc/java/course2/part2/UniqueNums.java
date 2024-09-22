package fc.java.course2.part2;

import java.util.*;

public class UniqueNums {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,1,2,3,4,5,6};
        Set<Integer> u = new HashSet<>();
        for(int n : nums){
            u.add(n);
        }
        System.out.println(u);
    }
}
