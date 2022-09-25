
import java.util.Scanner;


public class Main {
    private static House[] enterInfo(int count){
        House[] houses = new House[count];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < houses.length; i++){
            houses[i] = new House();
            System.out.print("Айді: ");
            houses[i].setId(scan.nextInt());
            scan.nextLine();
            System.out.print("Номер будинку:");
            houses[i].setNumber(scan.nextInt());
            System.out.print("Площа будинку:");
            houses[i].setArea(scan.nextInt());
            System.out.print("Поверх:");
            houses[i].setFloor(scan.nextInt());
            System.out.print("Кількість кімнат:");
            houses[i].setRooms(scan.nextInt());
            System.out.print("Назва вулиці:");
            houses[i].setStreet(scan.nextLine());
            System.out.print("");
            houses[i].setStreet(scan.nextLine());
            System.out.println("\n");
        }
        return houses;
    }

    private static void findNumber(House[] houses){
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість кімнат:");
        number = scan.nextInt();

        for(House house : houses){
            if(house.getRooms() >= number){
                System.out.println(house);
            }
        }
    }

    private static void findFloor(House[] houses){
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Введіть інтервал поверхів:");
        System.out.print("Від:");
        x = scan.nextInt();
        System.out.print("До:");
        y = scan.nextInt();

        if (x>y){
            int add = x;
            x = y;
            y = add;
        }

        for(House house : houses){
            if(house.getFloor() >= x && house.getFloor() <= y){
                System.out.println(house);
            }
        }
    }

    public static void findArea(House[] houses){
        Scanner in = new Scanner(System.in);
        double area;

        System.out.print("\nВведіть площу:");
        area = in.nextInt();

        for(int i = 0; i < houses.length ; i++ ){
            if(houses[i].getArea() >= area){
                System.out.print(houses[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть кількість будинків: ");
        int count = scan.nextInt();

        House[] houses = enterInfo(count);



        findNumber(houses);
        System.out.println();
        findFloor(houses);
        System.out.println();
        findArea(houses);
    }
}
