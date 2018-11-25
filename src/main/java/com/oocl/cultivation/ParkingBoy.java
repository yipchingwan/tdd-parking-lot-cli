package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
        setLastErrorMessage(null);
        if(this.parkingLot.getAvailableParkingPosition()>0){
            ParkingTicket ticket = new ParkingTicket(car);
            this.parkingLot.addCarToLot(ticket, car);
            return ticket;
        }
        else{
            this.setLastErrorMessage("The parking lot is full.");
            return null;
        }

    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
        if(ticket==null){
            this.setLastErrorMessage("Please provide your parking ticket.");
            return null;
        }
        else{
            if(ticket.checkIfTicketIsVaild()){
                Car car = this.parkingLot.removeCarFromLot(ticket);
                ticket.setTicketVaild(false);
                return car;
            }
            else{
                this.setLastErrorMessage("Unrecognized parking ticket.");
                return null;
            }
        }


    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public void setLastErrorMessage(String message) {
        this.lastErrorMessage = message;
    }
}
