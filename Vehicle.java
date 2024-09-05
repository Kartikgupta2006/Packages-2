package Abstraction;

public abstract class Vehicle implements transport {
    private int noOfTrires;

    public abstract void MakeStartSound();

    public Vehicle(int noOfTrires) {
        this.noOfTrires = noOfTrires;
    }



    public int getNoOfTrires() {
        return noOfTrires;
    }

    public void setNoOfTrires(int noOfTrires) {
        this.noOfTrires = noOfTrires;
    }

    public void commute(){
        System.out.println("going.....");
    }
}
