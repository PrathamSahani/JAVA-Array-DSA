//MAXIMUM AND MINIMUM ELEMENT AN ARRAY
//PRKASH SHUKLA

//METHOD
public class tut7{
    public static void main(String[] args) {
        int a[] = {6,2,34,1,9};
        findMaxAndMin(a);
    }
    static void findMaxAndMin(int a[]){
        if(a == null || a.length ==0)
        return;
        int min = a[0];
        int max = a[0];
        for(int i=1; i<a.length; i++){
        if(a[i]<min){
            min = a[i];

        }
        if(a[i]>max){
            max = a[i];
        }
    }
    System.out.println(max + " minimum");
    System.out.println(min+ " maximum");
}
}




//METHOD-1
public class tut7{
    static void minmax(int a[]){
        if(a==null || a.length ==0)
        return;
        int max = a[0];
        int  min = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max + " ");
        System.out.println(min + " ");
     }
    public static void main(String[] args) {
        int a[] = {1,2,33,6,7,43};
        minmax( a);
       
    }
}