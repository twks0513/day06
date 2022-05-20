package day06;

public class Quiz01 {

	public static void main(String[] args) {
		
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.print(i+"X"+j+"="+(i*j)+"\t");				
			}
			System.out.println();
		}
		System.out.println("\n\n");
		
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9;j++) {
				System.out.print(j+"X"+i+"="+(j*i)+"\t");
				
			}
			System.out.println();
		}

	}

}
