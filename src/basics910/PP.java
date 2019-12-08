package basics910;

public class PP {
X m1() {
	X xx = new X() ;
	return xx;
}
public static void main(String[] args) {
	PP p = new PP();
	X xxxx = p.m1() ;
	System.out.println(xxxx);
	//Y yyyy =  xxxx.m2();
	//Z zzzz  = yyyy.m8();
	String pqr= p.m1().m2().m8().m44("Hello");
	
	
	
}  

}
