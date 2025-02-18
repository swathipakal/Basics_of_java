
package assignment;
public class Area_circumf {

	public static void main(String[] args) {
					
	int s=5,b=2,h=4,l=5,w=10,ts1=3,ts2=3,r=3;
	int area_sq , area_rect, area_tri,peri_sq,peri_tri,peri_rect;
	double area_cir,circum_cir;
	
	area_sq= s*s;
	area_tri= b*h/2;
	area_rect=1*w;
	area_cir=3.14*r*r;
	
	peri_sq=4*s;
	peri_tri=b+ts1+ts2;
	peri_rect=2*l+2*w;
	circum_cir=2*3.14*r;
	
	System.out.println("----Area----");
	
	 System.out.println(area_sq);
	 System.out.println(area_tri);
	 System.out.println(area_rect);
	 System.out.println(area_cir);
	 
	 System.out.println("----Circumference----");
	 
	System.out.println(peri_sq);
	System.out.println(peri_rect);
	System.out.println(peri_tri);
	System.out.println(area_cir);
		
}

}
