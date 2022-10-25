//REVERSE THE ARRAY
//GFG

public class tut6{
    static void rev(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void print(int arr[], int size){
        for(int i=0; i<size; i++)
        System.out.print(arr[i]+ " ");
    }
    public static void main(String[] args) {
        int arr[] = new int[]{9,8,7,6,5,4,3,2,1,0};
        print(arr,10);
        rev(arr, 0, 9);
        System.out.println("REVERSE: ");
        print(arr,10);
    }
}