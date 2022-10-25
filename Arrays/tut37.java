// THREE WAYS PARTITIONG AN ARRAY AROUND A GIVEN RANGE
//GFG


public class tut37{
    static void THREE(int a[], int L, int H){
        int start=0, end = a.length-1;
        for(int i=0; i<=end;){
            if(a[i]<L){
            int temp = a[start];
            a[start] = a[i];
            a[i] = temp;
            start++;
            i++;
            }
            else if(a[i]>H){
                int temp = a[end];
                a[end] = a[i];
                a[i] = temp;
                end--;
                        }
                        else 
                        i++;
        }
    }
    public static void main(String[] args) {
        int a[] = {1,  14, 5, 4, 2, 54,
            20, 87, 98, 3, 32};
            THREE(a, 10, 20);
            System.out.println("RESULT : ");
            for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}