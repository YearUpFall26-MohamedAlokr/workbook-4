package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // ROOM TEST
        Room room = new Room(2, 124.00);
        System.out.println("=== ROOM TEST ===");
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());
        System.out.println();

        // RESERVATION TEST
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("=== RESERVATION TEST ===");
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price Per Night: $" + reservation.getPrice());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Weekend Stay: " + reservation.isWeekend());
        System.out.println("Reservation Total: $" + reservation.getReservationTotal());
        System.out.println();

        // EMPLOYEE TEST
        Employee employee = new Employee(101, "Mohamed Alokr", "Front Desk", 20.00, 45);
        System.out.println("=== EMPLOYEE TEST ===");
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Pay Rate: $" + employee.getPayRate());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOvertimeHours());
        System.out.println("Total Pay: $" + employee.getTotalPay());
    }
}
