//FIND UNION INTERSECTION OF TWO ARRAY
//Er Sahil Ka Gyan



//UNION
public class tut11{
static void  union(int a[], int b[], int n, int m){
    int i=0, j=0;
    while(i<n && j<m){
        if(a[i]<b[j])
        System.out.print(a[i++] + " ");
        else if(a[i]>b[j])
        System.out.print(b[j++] + " ");
        else{
            System.out.print(b[j++] + " ");
            i++;
        }
    }
        while(i<n)
        System.out.print(a[i++]);
        while(j<m)
        System.out.print(b[j++]);

    }
    public static void main(String[] args) {
        int a[] = {1,3,4,2,5,6,7,8,9};
        int b[] = {2,3,4,1,3,7,8,9};
        int n = a.length;
        int m = b.length;
        union(a, b, n, m);
    }

}






//INTERSECTION
public class tut11{
    static void INTERSECTION(int a[], int b[], int n, int m){
        int i=0, j=0;
        while(i<n & j<m){
            if(a[i]<b[j])
             i++;
            else if(a[i]>b[j])
               j++;
            else{
            System.out.print(b[j++] + " ");
            i++;
            }
        }

    }
    public static void main(String[] args) {
        int a[] = {1,3,4,5,6,7,8};
        int b[] = {2,3,4,1,10,23,45,67,98};
        int n = a.length;
        int m = b.length;
        System.out.print("2Intersection : ");
        INTERSECTION(a, b, n , m);
        
    }
}