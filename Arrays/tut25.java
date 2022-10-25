// Rearrange array in alternating positive & negative items with O(1) extra space
// Er sahil ka gyan

public class tut25{
    static void  Rearrange(int a[], int n){
        int i=0;
        int j=n-1;

        // Shift all negative element to the end
        while(i<j){
                while(i<=n-1 && a[i]>0)
                i+=1;
                while(j>=0 && a[j]<0)
                j+=1;
                if (i<j)
                swap(a,i,j);
            }
            if(i==0|| i==n)
            return;
            int k=0;
            while(k<n && i<n){
                swap(a,k,i);
                i=i+1;
                k=k+2;
            }
        } 
        static void swap(int a[], int i, int j){
            int c=a[i];
            a[i] =a[j];
            a[j] = c;
        }
        public static void main(String[] args) {
            int a[] = {2,3,-4,-1,6,-9};
            int n = a.length;
            Rearrange(a,n);
            for(int i=0; i<a.length; i++)
            System.out.println(a[i]+ " ");

        }

    }


