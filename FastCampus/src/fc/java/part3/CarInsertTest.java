package fc.java.part3;
import fc.java.model.*;
import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        carDTO c = new carDTO();
        Scanner sc  = new Scanner(System.in);
        System.out.print("자동차 일련번호 :");
        int carSn = sc.nextInt();
        sc.nextLine();
        System.out.print("자동차 이름 :");
        String carModel = sc.next();
        sc.nextLine();
        System.out.print("자동차 가격 :");
        int carPrice = sc.nextInt();
        sc.nextLine();
        System.out.print("자동차 소유자 :");
        String carOwner = sc.next();
        sc.nextLine();
        System.out.print("자동차 연식 :");
        int carYear = sc.nextInt();
        sc.nextLine();
        System.out.print("자동차 타입 :");
        String carType = sc.next();
        sc.nextLine();
        System.out.println(carSn+"\t"+carModel+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        c.carSn = carSn;
        c.carType =carType;
        c.carName = carModel;
        c.carPrice = carPrice;
        c.carOwner = carOwner;
        c.carYear = carYear;
        carDAO dao = new carDAO();
        dao.carInsert(c);
    }
}
