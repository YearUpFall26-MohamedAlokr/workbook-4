package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void punchOutShouldCalculateHoursWorkedCorrectly() {
        // Arrange
        Employee employee = new Employee(
                1,
                "Mohamed",
                "IT",
                25.00,
                0
        );

        // Act
        employee.punchIn(8);
        employee.punchOut(16);

        // Assert
        assertEquals(8, employee.getHoursWorked());
    }

    @Test
    public void multiplePunchesShouldAccumulateHoursWorked() {
        // Arrange
        Employee employee = new Employee(
                1,
                "Mohamed",
                "IT",
                25.00,
                0
        );

        // Act
        employee.punchIn(8);
        employee.punchOut(12);   // 4 hours

        employee.punchIn(13);
        employee.punchOut(17);   // 4 hours

        // Assert
        assertEquals(8, employee.getHoursWorked());
    }

    @Test
    public void punchTimeCardShouldCalculateHoursWorkedCorrectly() {
        // Arrange
        Employee employee = new Employee(
                1,
                "Mohamed",
                "IT",
                25.00,
                0
        );

        // Act
        employee.punchTimeCard(8, 16);

        // Assert
        assertEquals(8, employee.getHoursWorked());
    }
}