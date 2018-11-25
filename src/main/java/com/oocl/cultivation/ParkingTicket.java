package com.oocl.cultivation;

public class ParkingTicket {
    private Car car;

    public ParkingTicket() {
        this.car = null;
    }

    public ParkingTicket(Car car) {
        this.car = car;
    }

    public Car getCar(){
        return this.car;
    }


}
