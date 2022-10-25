//MOVE ALL NAGATIVE & POSITIVE ONE SIDE OF ARRAY
//Er Sahil Ka Gyan 

public class tut10{
    static void Rearrange(int a[]){
        int t[] = new int[a.length];
        int j=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>=0)
            t[j++] =a[i];
            if(j==0 || j==a.length)
            return;
        }
        for(int i=0; i<a.length; i++){
        if(a[i]<0)
        t[j++] =a[i];
        }
        for(int i=0; i<a.length; i++){
        a[i]= t[i];
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,-3,-2,-4,-6,-7,3,4,5,2,1};
        Rearrange(a);
        for(int i=0; i<a.length; i++)
        System.out.print(a[i]+ " ");
    }

}