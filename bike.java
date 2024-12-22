import java.util.Scanner;

public class bike {
    Scanner obj = new Scanner(System.in);
    String name;
    String company_name;
    int price;
    String engine_power;
    int strokes;
    String mileage;

public void getData(){

    System.out.println("\n Enter the bike name : \n");
    name = obj.nextLine();

    System.out.println("\n Enter the bike company : \n");
    company_name = obj.nextLine();

    System.out.println("\n Enter bike's Engine power : \n");
    engine_power = obj.nextLine();

    System.out.println("\n Enter the bike mileage : \n");
    mileage = obj.nextLine();

    System.out.println("\n Enter the price of the bike : \n");
    price = obj.nextInt();

    System.out.println("\n Enter the strokes : \n");
    strokes = obj.nextInt();

}

public void display(){

    System.out.println("\n Details of the bike are as follows : \n");
    System.out.println("\n Name of the bike     : "+name);
    System.out.println("\n Company name of bike : "+company_name);
    System.out.println("\n Price of the bike    : "+price);
    System.out.println("\n Engine power of bike : "+engine_power);
    System.out.println("\n Strokes of the bike  : "+strokes);
    System.out.println("\n Mileage of the bike  : "+mileage);

}

public static void main(String[] args) {
    
    bike bike1 = new bike();
    bike1.getData();
    bike1.display();
}

}
