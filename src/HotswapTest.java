
public class HotswapTest{

	public static void main(String[] args) {
		System.out.println("Starting");
		while(true){
			System.out.println(".");//Changes inside the main function dont work, the function is always running so it cant be swapped.

			change();

			try{
				Thread.sleep(1000);
			
			}catch(Exception e){
				System.out.println("excep" + e);
			}
		}
	}

	public static void change(){
			//Demo function
			int a=0;
			int spaces=10;
			int chars=0;
			char piramid='c';//for example change this

			for (int j=0; j<10; j++) {
				for (int i=0;i<spaces;i++) {
					System.out.print(" ");
				}
				for (int i=0;i<=chars*2;i++) {
					System.out.print(piramid);
				}
				System.out.print("\n");
				chars++;
				spaces--;
			}
	}
}