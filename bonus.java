import java.util.Scanner;

public class bonus {
        Scanner obj = new Scanner(System.in);
        int years;
    
public void getData(){

    System.out.println("\n Enter the years of service of Employee : \n");
    years = obj.nextInt();
}
    
public void display(){

    if(years>=10){
            System.out.println("\n Bonus offered = Rs.10,000/- ");
    }

    else if(years>=7 && years<10){
            System.out.println("\n Bonus offered = Rs.7,000/-");
    }

    else if(years>=5 && years<7){
            System.out.println("\n Bonus offered = Rs.5,000");
    }
    else if(years>=3 && years<5){
        System.out.println("\n Bonus offered = Rs.3,000");
    }
    else if(years>=1 && years<3){
        System.out.println("\n Bonus offered = Rs.2,000/-");
    }
    else{
        System.out.println("\n Bonus offered = Rs.1,000/-");
    }

}

public static void main(String[] args) {
    bonus bonus1 = new bonus();
    bonus1.getData();
    bonus1.display();
}
}
