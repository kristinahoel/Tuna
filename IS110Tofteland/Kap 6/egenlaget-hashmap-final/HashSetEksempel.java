import java.util.*;  
class HashSetEksempel{  
    public static void main(String args[]){  
        //Creating HashSet and adding elements  
        HashSet<String> set=new HashSet();  
        set.add("En");    
        set.add("To");    
        set.add("Tre");   
        set.add("Fire");  
        set.add("Fem");  
        for (String i : set) {
            System.out.println(i);
        } 
    }  
}  