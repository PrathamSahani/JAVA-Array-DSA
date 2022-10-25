// COUNT INVERSION IN ARRAY
// GFG

public class tut21{
    static int arr[] = {8,4,2,1};
    static int next(int n){
        int id=0;
        for(int i=0; i<n-1; i++)
        for(int j=i+1; j<n; j++)
        if(arr[i]>arr[j])
        id++;
        return id;
    }
    public static void main(String[] args) {
        System.out.println(next(arr.length));
    }
}