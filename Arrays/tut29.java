// FIND LONGEST COINSECUTIVE SUBSEQUENCE
// Er sahil ka gyan

import java.util.*;
public class tut29{
    static int longcos(int a[]){
        HashSet<Integer> hs = new HashSet<>();
        int ans =0;
        for(int i=0; i<a.length; i++)
        hs.add(a[i]);
        for(int i=0; i<a.length; i++){
            if(!hs.contains(a[i]-1)){
                int j=a[i];
                while(hs.contains(j))
                j++;
                if(ans<j-a[i])
                ans = j-a[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,9,3,10,20,2,4};
        System.out.println(longcos(a));
    }
}