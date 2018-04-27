import java.util.*;
class tri{
	public static void main(String args[]){
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the limit");
	/*int z=1;
	int n=x.nextInt();
	for (int i=0;i<=n;i++){
		for(int j=0;j<=i;j++){
			System.out.print(z);
			z++;
		}System.out.println(" ");
	}*/
	int z;
	int n=x.nextInt();
	for (int i=0;i<=n;i++){
		if((i%2)==0){
				z=1;
			}
			else {
				z=0;
			}
		for(int j=0;j<=i;j++){
			System.out.print(z);
			if(z==0){
				z=1;
			}
			else{
				z=0;
			}
		}System.out.println(" ");
	}
	}
	
}