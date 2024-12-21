import java.util.Scanner;

public class DemoEmployee {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("\n Enter the Name of the Employee : \n");
        String name = obj.nextLine();

        System.out.println("\n Enter the Name of Department   : \n");
        String dept = obj.nextLine();

        System.out.println("\n Enter the Designation          : \n");
        String desg = obj.nextLine();

        System.out.println("\n Enter Email ID                 : \n");
        String email = obj.nextLine();

        System.out.println("\n Enter Contact Number           : \n");
        int contactNo = obj.nextInt();

        System.out.println("\n Enter the Gross Salary         : \n");
        int grossSal = obj.nextInt();

        System.out.println("\n Enter the Employee ID          : \n");
        int empidD = obj.nextInt();

        System.out.println("\n Details of the Employee are as follows : \n");

        System.out.println("\n Details of the employee are : \n");
        System.out.println("Name of the Employee : "+name);
        System.out.println("Employee ID          : "+empid);
        System.out.println("Department           : "+dept);
        System.out.println("Designation          : "+desg);
        System.out.println("Gross Salar          : "+grossSal);
        System.out.println("Contact Number       : "+contactNo);
        System.out.println("Email ID             : "+email);

    }
    
}
