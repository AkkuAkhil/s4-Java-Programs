class add{
	int a,b,c;
	double p,q,r;
	add(){
		
	}
	add(int x,int y){
		a=x;
		b=y;
		c=a+b;
		System.out.println("Sum is = "+c);
	}
	add(double x,double y){
		p=x;
		q=y;
		r=p+q;
		System.out.println("Sum is = "+r);
	}
	public static void main(String arg[]){
		add a=new add(1,2);
		add b=new add(1.4,3.5);
	}
}