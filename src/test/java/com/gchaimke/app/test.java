public class test{
	public static void main(String[] arg){
		System.out.println("Calculate...");
		try{
		int num1 = Integer.valueOf(arg[0]);
		int num2 = Integer.valueOf(arg[2]);
		String sign = arg[1];
		test t = new test();
			if(sign.equals("+")){
				System.out.println(t.sum(num1,num2));
			}else if(sign.equals("-")){
				System.out.println(t.sub(num1,num2));
			}else if(sign.equals("*")){
				System.out.println(t.umn(num1,num2));
			}else if(sign.equals("/") && num1!=0 && num2!=0){
				System.out.println(t.dev(num1,num2));
			}
		}catch (Exception e){
			System.out.println("Input data error");
		}
		
		
	}
	int sum(int num1, int num2){
		return num1+num2;
	}
	int sub(int num1, int num2){
		return num1-num2;
	}
	int umn(int num1, int num2){
		return num1*num2;
	}
	int dev(int num1, int num2){
		return num1/num2;
	}
}