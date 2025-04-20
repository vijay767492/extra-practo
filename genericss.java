import java.util.Vector;

public class genericss {
    public static void main(String[] args) {
        Vector <Integer>v=new Vector();// without generics we get typecast error at runtime and also 
        //if we want to add those int values but there is a string then we get type lang error so to avoid that we use the generics concept that specify before adding the elements into the list example if it is string then only string values are added to it if it 
        v.add(3);
        v.add(5);
        v.add(1);
        v.add(38);
        v.add(33);
      
        int sum=0;
        System.out.println(v.get(0));
        for (int i=0;i<v.size();i++){
            sum=sum+((Integer)v.get(i));
        }
        System.out.println(sum);
    }
}