package com.cabapp.model;

public class Cab {




    public Cab() {
        super();
    }
    public Cab(int cabNum,int numOfSeats,int cabPrice,String cabCompany,String cabColor){
        super();
        this.cabNum=cabNum;
        this.numOfSeats=numOfSeats;
        this.cabPrice=cabPrice;
        this.cabCompany=cabCompany;
        this.cabColor=cabColor;
    }

    public int getCabNum() {
        return cabNum;
    }

    public void setCabNum(int cabNum) {
        this.cabNum = cabNum;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getCabPrice() {
        return cabPrice;
    }

    public void setCabPrice(int cabPrice) {
        this.cabPrice = cabPrice;
    }

    public String getCabCompany() {
        return cabCompany;
    }

    public void setCabCompany(String cabCompany) {
        this.cabCompany = cabCompany;
    }

    public String getCabColor() {
        return cabColor;
    }

    public void setCabColor(String cabColor) {
        this.cabColor = cabColor;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "cabNum=" + cabNum +
                ", numOfSeats=" + numOfSeats +
                ", cabPrice=" + cabPrice +
                ", cabCompany='" + cabCompany + '\'' +
                ", cabColor='" + cabColor + '\'' +
                '}';
    }


}
