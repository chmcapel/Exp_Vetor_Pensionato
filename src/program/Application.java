package program;

import entities.Student;

import javax.sound.midi.SysexMessage;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Student[] rooms = new Student[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int rent = i +1;
            sc.nextLine();
            System.out.println("Rent #" + rent +": ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room] = new Student(name, email, room);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(rooms[i].getRoom()
                        + ": "
                        + rooms[i].getName()
                        + ", "
                        + rooms[i].getEmail());
            }
        }

        sc.close();
    }
}
