public class staticvar {
    static int a=0;
     public  void m1(){
        a=12;
     }
     public void m2(){
        a=32;
     }
     public static void main(String[] args) {
        staticvar ff=new staticvar();
        ff.m1();
        System.out.println(a);
        ff.m2();
        System.out.println(a);
        System.out.println("stop that");
        ff.m1();  
        //    ff.m2();
        System.out.println(a);
     }
}
