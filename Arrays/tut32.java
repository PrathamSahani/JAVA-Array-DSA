//WHETHER AN ARRAY OF SUBSET OF ANOTHER ARRAY
//GFG


//METHOD -1 
public class tut32{
    static boolean SUBSET(int a1[], int a2[]){
        int i=0;
        int j=0;
        for(i=0; i<a1.length; i++){
            for(j=0; j<a2.length; j++)
            if(a1[i]==a2[j])
            break;

            if(j==a2.length)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a1[] = {1,2,4,6,8,9};
        int a2[] = {3,4,5,78,6,21,1,2,8,9};
        if(SUBSET(a1, a2))
        System.out.println("Yaa !");
        else
        System.out.println("Nope");
        
    }
}


//METHOD -2
import java.util.HashSet;
public class tut32{
    static boolean SUBSET(int a1[], int a2[]){

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<a1.length; i++){
            if(!hs.contains(a1[i]))
            hs.add(a1[i]);
        }
            for(int i=0; i<a2.length; i++){
            if(!hs.contains(a2[i]))
            return false;
            }
            return true;
        }
        
    
    public static void main(String[] args) {
        int a1[] = {1,2,3,5,6,8};
        int a2[] = {1,2,3};
        if(SUBSET(a1, a2))
        System.out.println("Yaa");
        else
        System.out.println("Nope");
    }
}