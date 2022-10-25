//FIND MAXIMUM PRODUCT SUBARRAY 
//GFG

public class tut28{
    static int maxsub(int a[]){
        int result =0;
        for(int i=0; i<a.length; i++){
            int mul = a[i];
            for(int j=i+1; j<a.length;0 j++){
                result = Math.max(result, mul);
                mul *=a[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }
    public static void main(String[] args) {
        
            int a[] = { 1, -2, -3, 0, 7, -8, -2};
            System.out.println("Maximum Subarray is : "+maxsub(a));
        
    }
}