//  FIND IS THERE IS ANY SUBARRAY SUM EQUAL TO ZERO 
//GFG
//we need to remove 26 for run program


import java.util.HashSet;
import java.util.Set;
class tut26{
    static boolean Sum(int a[]){
        Set<Integer> hs = new HashSet<>();
        int sum=0;

        for(int i=0; i<a.length; i++){
            sum +=a[i];
            if(a[i]==0 || sum==0 ||hs.contains(sum))
            return true;
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {4, 2, -3, 1, 6};
        if(Sum(a))
        System.out.println("yes");
        else
        System.out.println("NO");
        }
}