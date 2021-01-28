import children.*;
import parents.*;
import Grandparents.*;
public class Main {
public static void main(String[] args) {
	children Jake = new children();
	children Arihan = new children();
	
	System.out.println("Can Jake Drive:" + Jake.getcanJakeDriveVehicle());
	System.out.println("Can Arihan Drive:" + Arihan.getcanArihanDriveVehicle());
	System.out.println("Can Arihan get a phone:" + Arihan);
}
}
