//FIND DUPLICATE AN ARRAY OF (N-1) 
//Er Shail ka Gyan


//METHOD
public class tut16{
    public static void main(String[] args) {
        int a[]= {1,2,3,42,3,1,5,6};
    for(int i=0; i<a.length; i++) {
        for(int j=i+1; j<a.length ; j++){
            if(a[i]==a[j]){
                System.out.println(a[j]);
            }
        }
    }
   }
}




//METHOD
public class tut16{
    static void DUPLICATE(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+ " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,4,5,6,7,8,9,10,10};
        DUPLICATE(arr);
    }
}