import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;


class Student{
    int age;
    String name;
    
}
public class Demo{

   public static void main(String a[]){
    List<Integer>nums=new ArrayList<Integer>();
    nums.add(8);
    nums.add(9);
    nums.add(10);
    nums.add(12);
    nums.add(11);
 

  //sort according to your own need
   Comparator<Integer> com =new Comparator<Integer>(){
        public int compare(Integer i, Integer j){
              if(i%10 > j%10){
                return 1;
              }else{
                return -1;
              }
        }
   };


    Iterator<Integer>values=nums.iterator();
    while(values.hasNext()){
        System.err.println(values.next());
    }

    System.err.println("--------------");
    Collections.sort(nums,com);
    System.err.println(nums);

 Map<String,Integer>mapp=  new HashMap<>();
   }
}