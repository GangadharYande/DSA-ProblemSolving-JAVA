import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String args[]) {
        // Sorting on basis of last digit  in accending order 
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
                if(i%10 > j%10) return 1;  // returns true (1) .
                else  return -1;           // returns false (-1)
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(99);
        nums.add(78);
        System.out.println(nums);

        Collections.sort(nums,com);
        System.out.println(nums);
        
    }
}