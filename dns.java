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

	String write="",we="";
	Scanner sc = new Scanner(System.in);
	if(sc.nextLine().equals("")){
		write = "nameserver 178.22.122.100";
		we ="178.22.122.100";
	}
	else{
		write = "nameserver "+sc.nextLine();
	}
	try{
	File file = new File("/etc/resolv.conf");
	File file2 = new File("./wr.txt");
	String finals="";
	FileWriter wr = new FileWriter(file);
	Scanner ssc = new Scanner(file2);
	while(ssc.hasNextLine()){
	finals += ssc.nextLine();
	finals += "\n";
    }
	finals += "\n"+write;
	wr.write(finals);
	wr.close();
	System.out.print("your DNS changed to: "+we);
	}catch(Exception e){
		System.out.println("faled!!");
		System.out.println("i have not permission");
		System.out.println(":>> please run me by root user  (sudo) and i maked for ubuntu!");
	}
}
}
