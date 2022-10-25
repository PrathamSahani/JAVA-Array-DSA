//FIND TRIPLET SUM IN ARRAY
//GFG

public class tut33{
    static boolean SUBSET(int a[] , int a_size , int sum){
        for(int i=0; i<a_size-2; i++){
            for(int j=i+1; j<a_size-1; j++){
                for(int k=j+1; k<a_size; k++){
                    if(a[i]+a[j]+a[k]==sum){
                        System.out.println("Triplet : "+a[i]+ " "+a[j]+ " "+a[k]);
                        return true;
                    }
                }
            }
        }
        System.out.println("Nothing !");
        return false;
    }
    public static void main(String[] args) {
        tut33 ne = new tut33();
        int a[] = {1,5,78,4,2,3,68};
        int sum = 20;
        int a_size = a.length;
        ne.SUBSET(a, a_size, sum);
    }
}