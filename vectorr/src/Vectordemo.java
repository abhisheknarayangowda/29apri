import java.util.HashSet;
import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v1 =new Vector();
Vector v2=new Vector();
String s1=new String("shek");
String s2=new String("shek");
v1.add(s1);
v2.add(s2);
System.out.println(v1.contains(s2));
System.out.println(v2.contains(s2));

HashSet hs1=new HashSet();
hs1.add(s1);
System.out.println(hs1.contains(s2));
	}

}
