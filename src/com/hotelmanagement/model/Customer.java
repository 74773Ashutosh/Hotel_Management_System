package com.hotelmanagement.model;

public class Customer {
    private String name;
    private String contactNumber;
    private int bookedRoomNumber;

    public Customer(String name, String contactNumber, int bookedRoomNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.bookedRoomNumber = bookedRoomNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public int getBookedRoomNumber() {
        return bookedRoomNumber;
    }

    public void setBookedRoomNumber(int bookedRoomNumber) {
        this.bookedRoomNumber = bookedRoomNumber;
    }
}
