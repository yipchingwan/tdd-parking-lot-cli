package com.oocl.cultivation;

import sun.security.krb5.internal.Ticket;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotServiceManager extends ParkingBoy {
    private final List<ParkingBoy> parkingBoysList;

    public ParkingLotServiceManager(ParkingLot parkingLot){
        super(parkingLot);
        this.parkingBoysList = null;
    }

    public ParkingLotServiceManager(List<ParkingLot> parkingLots, List<ParkingBoy> parkingBoysList) {
        super(parkingLots);
        this.parkingBoysList = parkingBoysList;
    }

    public List<ParkingBoy> getParkingBoysList(){
        return this.parkingBoysList;
    }

    public ParkingTicket askParkingBoyParkCar(ParkingBoy parkingBoy, Car car){
        if(this.parkingBoysList.contains(parkingBoy)){
            return parkingBoy.park(car);
        }
        else{
            return null;
        }
    }
    public Car askParkingBoyFetchCar(ParkingBoy parkingBoy, ParkingTicket ticket){
        if(this.parkingBoysList.contains(parkingBoy)){
            return parkingBoy.fetch(ticket);
        }
        else{
            return null;
        }
    }

    public ParkingTicket park(Car car, ParkingLot parkingLot) {
        if(this.parkingLots.contains(parkingLot)){
            return super.park(car);
        }
        else{
            return null;
        }
    }

    public Car fetch(ParkingTicket ticket, ParkingLot parkingLot) {
        if(this.parkingLots.contains(parkingLot)){
            return super.fetch(ticket);
        }
        else{
            return null;
        }

    }
}
