
import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(10);
        set.add(16);
        System.out.println(set);

        //Searching
        if(set.contains(2)){
            System.out.println("The set contains the element");
        if(!set.contains(100)){
            System.out.println("The set does  not contains the eelment");


        }
        //Size
        System.out.println("Size:" +set.size());


        //Iterator

     Iterator<Integer>it=set.iterator();
     while(it.hasNext()){
        System.out.println(it.next());
     }

        }


    }
    
}
