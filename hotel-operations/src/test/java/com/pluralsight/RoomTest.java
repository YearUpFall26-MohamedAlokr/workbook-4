package com.pluralsight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    // room should be occupied and dirty

    // checkIn()
    @Test
    public void checkInShouldBeOccupiedAndNotDirtyAndNotAvalible() {
        //arrange
        Room room = new Room(2, 124.00);

        //Act
        room.checkIn();

        //Assert
        boolean Occupied = room.isOccupied();
        boolean Dirty =room.isDirty();
        boolean Available = room.isAvailable();
        assertTrue(Occupied);
        assertFalse(Dirty);
        assertFalse(Available);
    }

    // checkOut()
    @Test
    public void checkOutShouldBeNotOccupiedAndDirtyAndNotAvalible() {
        //arrange
        Room room = new Room(2, 124.00);

        //Act
        room.checkOut();

        //Assert
        boolean Occupied = room.isOccupied();
        boolean Dirty =room.isDirty();
        boolean Available = room.isAvailable();
        assertFalse(Occupied);
        assertTrue(Dirty);
        assertFalse(Available);
    }
    //cleanRoom()
    @Test
    public void cleanRoomShouldBeNoDirty() {
        //arrange
        Room room = new Room(2, 124.00);

        //Act
        room.cleanRoom();

        //Assert

        boolean Dirty =room.isDirty();
        assertFalse(Dirty);
    }
    @Test
    public void cleanRoomAfterCheckoutShouldBeNoDirtyAndAvalible() {
        //arrange
        Room room = new Room(2, 124.00);

        //Act
        room.checkOut();
        room.cleanRoom();

        //Assert

        boolean Dirty =room.isDirty();
        boolean Available = room.isAvailable();
        assertFalse(Dirty);
        assertTrue(Available);

    }

}
