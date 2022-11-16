package CJOcT18;
//is there any situation when finally will not execute
public class FinallyExample {

	public static void main(String[] args) {
		 try {
			 System.out.println("welcome!"+ 10/0);
			 System.exit(0);//because of it finally will not be executed!(forcefully terminate main)
		 }
		 finally {
			 System.out.println("finally!");
		 }

	}

}
