/*
	1
	23
	456
	78910
*/

class program2{
	public static void main(String[]args){
		int count=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(count+" ");
			count++;
			}
		System.out.println();
		}
	}
}