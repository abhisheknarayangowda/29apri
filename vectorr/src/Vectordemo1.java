import java.util.HashSet;

public class Vectordemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("shek");
		String s2=new String("shek");
		HashSet hs1=new HashSet();
		hs1.add(s1);
		System.out.println(hs1.contains(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
