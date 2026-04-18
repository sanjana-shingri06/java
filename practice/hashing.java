import java.util.*;
public class hashing{
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("India",150);
        map.put("Nepal",20);
        map.put("Sri Lanka",59);
        map.put("Bangladesh",30);
        System.out.println(map);
        if(map.containsKey("India")){
            System.out.println("Contains");
        }
        else{
            System.out.println("Does not contains");
        }
       Set<String>key=map.keySet();
       for(String keys:key){
        System.out.println(key+" "+map.get(keys));
       }
       map.remove("Nepal");
       System.out.println(map);
    }
}