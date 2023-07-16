package DP_FactoryMethod;

abstract class Vehicle {
    abstract public void printVehicleInfo();
}

class TwoWheeler extends Vehicle {
    public void printVehicleInfo()
    {
        System.out.println("I am a vehicle with three wheels");
    }
}

class ThreeWheeler extends Vehicle {
    public void printVehicleInfo()
    {
        System.out.println("I am a vehicle with three wheels");
    }
}

class FourWheeler extends Vehicle {
    public void printVehicleInfo()
    {
        System.out.println("I am a vehicle with three wheels");
    }
}

// Class Vehicle Factory with a single responsibility to
// construct Vehicles according to the clients requests.
// PS: This class can be extended to TwoWheelerFactory,
// ThreeWheelerFactory and so on.
