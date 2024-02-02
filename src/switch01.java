
public class switch01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a=1;
		if(a==0) {
			System.out.println("aは0に等しい");
		} else if(a==1) {
			System.out.println("aは1に等しい");
		}

		String D="赤";
		
		switch(D) {
		case "赤":
			System.out.println("紅組です");
			break;
			
		case "白":
			System.out.println("白組です");
			break;
		}
	}

}
