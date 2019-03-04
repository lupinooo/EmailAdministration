package email;

public class EmailMain {
   public static void main(String[] args) {
	   
	   Email em1=new Email("Vlad", "Popescu");
	   
	   System.out.println(em1.showInfo());
	   
	   System.out.println(em1.schimbareParola("vpopescu1234"));
	   
	
}
}
