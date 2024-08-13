package com.hotelmanagement.main;

import com.hotelmanagement.model.Room;
import com.hotelmanagement.service.Hotelservice;

import java.util.List;
import java.util.Scanner;

public class HotelManagementApp {
    public static void main(String[] args) {
        Hotelservice hotelservice = new Hotelservice();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Hotel Management System");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Vacate a Room");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    List<Room> availableRooms = hotelservice.getAvailableRooms();
                    System.out.println("Available Rooms:");
                    for (Room room : availableRooms) {
                        System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getRoomType());
                    }
                    break;
                case 2:
                    System.out.print("Enter Room Number to Book: ");
                    int roomNumberToBook = scanner.nextInt();
                    hotelservice.bookRoom(roomNumberToBook);
                    System.out.println("Room booked successfully.");
                    break;
                case 3:
                    System.out.print("Enter Room Number to Vacate: ");
                    int roomNumberToVacate = scanner.nextInt();
                    hotelservice.vacateRoom(roomNumberToVacate);
                    System.out.println("Room vacated successfully.");
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
