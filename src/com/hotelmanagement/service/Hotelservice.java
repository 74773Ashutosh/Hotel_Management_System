package com.hotelmanagement.service;

import com.hotelmanagement.model.Room;
import java.util.ArrayList;
import java.util.List;

public class Hotelservice {
    private List<Room> rooms;

    public Hotelservice() {
        rooms = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        rooms.add(new Room(101, "Single", true));
        rooms.add(new Room(102, "Double", true));
        rooms.add(new Room(103, "Suite", true));
        // Add more rooms as needed
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setAvailable(false);
            }
        }
    }

    public void vacateRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setAvailable(true);
            }
        }
    }
}
