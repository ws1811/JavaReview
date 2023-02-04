
public class Array03MainArg {
	public static void main(String[] args) {
		if(args[0].equals("ggm")&&args[1].equals("1234")) {	
			for(int i=0;i<args.length;i++) {
				System.out.println("args[" + i + "] = " + args[i]);
			}
		}else {
			System.out.println("fail...");
		}
	}
}
