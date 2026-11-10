package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        // ROOM TESTING
        System.out.println("=== ROOM TEST ===");
        Room room = new Room(2, 124.00);
        System.out.println("Available: " + room.isAvailable());
        room.checkIn();
        System.out.println("After Check-In");
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        room.checkOut();
        System.out.println("After Check-Out");
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        room.cleanRoom();
        System.out.println("After Cleaning");
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        System.out.println();

        // RESERVATION TESTING
        System.out.println("=== RESERVATION TEST ===");
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price Per Night: $" + reservation.getPrice());
        System.out.println("Nights: " + reservation.getNumberOfNights());
        System.out.println("Weekend: " + reservation.isWeekend());
        System.out.println("Total: $" + reservation.getReservationTotal());

        System.out.println();

        // EMPLOYEE TESTING
        System.out.println("=== EMPLOYEE TEST ===");
        Employee employee = new Employee(101,"Mohamed Alokr", "Front Desk", 20.00, 0);
        employee.punchIn(8);
        employee.punchOut(12);
        employee.punchIn(13);
        employee.punchOut(17);
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOvertimeHours());
        System.out.println("Total Pay: $" + employee.getTotalPay());

        System.out.println();

        // BONUS TEST
        System.out.println("=== BONUS TEST ===");
        Employee employee2 = new Employee(102, "John Smith", "Housekeeping", 18.00, 0);
        employee2.punchTimeCard(8, 12);
        employee2.punchTimeCard(13, 17);
        System.out.println("Hours Worked: " + employee2.getHoursWorked());
        System.out.println("Total Pay: $" + employee2.getTotalPay());

        System.out.println();

        Hotel hotel = new Hotel("Grand Hotel", 10, 50);
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());

        boolean booked = hotel.bookRoom(3, true);
        System.out.println("Booking Successful: " + booked);
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        booked = hotel.bookRoom(60, false);
        System.out.println("Booking Successful: " + booked);
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
    }
}
