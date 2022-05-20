package day06;

public class Ex01 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
		     System.out.println("===for½ÃÀÛ");
		     for(int j=1; j<=5; j++){
		    	 System.out.println(i+":"+j);
		     }
		     System.out.println("for³¡===");
		}

		int sum = 0;
		for(int i=1; i<=10000; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
