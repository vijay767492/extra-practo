public class LargeAreaOfWater {
    public static int maxarea(int [] a){
int length=0;
int val=0;
int max=0;
int width=0;

        if(a.length==0||a.length==1){
            return 0;
        }
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    length=a[i];
             
                }
                else{
                    length=a[j];
                  
                }
                width=j-i;
               
                val=length*width;
                if(max<val){
                max=val;}
          
        }
    }
return max; }
public static void main(String[] args) {
    int[] a={1,8,6,2,5,4,8,3,7};
    System.out.println(maxarea(a));
}
}