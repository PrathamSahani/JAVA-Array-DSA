//SORT AN ARRAY WHICH CONSISTS OF 0, 1 AND WITHOUT USING EXTRA ALGO 
//Er Sahil Ka Gyan

public class tut9{
    public static void main(String[] args) {
        int a[] = {1,0,2,0,1,2,0,2,2,0,0,1,1};
        int b0=0, b1=0, b2=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0)
            b0++;
            else if(a[i]==1)
            b1++;
            else
            b2++;
        }
        int k=0;
        for(int i=0; i<b0; i++)
        a[k++]=0;
        for(int i=0; i<b1; i++)
        a[k++]=1;
        for(int i=0; i<b2; i++)
        a[k++]=2;

        for(int i=0; i<a.length; i++)
        System.out.print(a[i]+ " ");


    }
}