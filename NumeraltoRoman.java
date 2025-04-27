public class NumeraltoRoman {
    public static  String leetcode12(int num){
        int[] a={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] b={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder roman=new StringBuilder();
        int result=num;
        int[] value=a;
     
        while (result > 0){
            int max=0;
            int index=0;
            for (int j=0;j<a.length;j++){
if(a[j]<=result&&value[j]>max){
    max=value[j];
    index=j;
}
            }
            result=result-max;
            roman.append(b[index]);
        }
        
        return roman.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(leetcode12(846));
    }
}
