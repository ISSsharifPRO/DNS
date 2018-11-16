import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class dns{
public static void main(String[] args) {
	System.out.println("**********************************************************");
	System.out.println("**********************************************************");
	System.out.println("**        i'll change your DNS to 178.22.122.100        **");
	System.out.println("**        if you have another DNS => enter it!!!        **");
	System.out.println("**                    or press enter                    **");
	System.out.println("**********************************************************");
	System.out.println("**********************************************************");

	String write="";
	Scanner sc = new Scanner(System.in);
	if(sc.nextLine().equals("")){
		write = "178.22.122.100";
	}
	else{
		write = sc.nextLine();
	}
	try{
	File file = new File("/etc/resolv.conf");
	FileWriter wr = new FileWriter(file);
	wr.write(write);
	wr.close();
	System.out.print("your DNS changed to: "+write);
	}catch(Exception e){
		System.out.println("faled!!");
		System.out.println("i have not permission");
		System.out.println(":>> please run me by root user  (sudo) and i maked for ubuntu!");
	}
}
}
