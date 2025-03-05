package Recurstion;

 
public  class facto{
public static int factorial(int a){
    if (a==0||a==1){return 1;}
        
    int fact=factorial(a-1)*a;
    return fact;

}

public static void main(String[] args) {
System.out.println(factorial(6));
}
}



