package DP_FactoryMethod;

class Client {

    private Vehicle pVehicle;

    Client() { pVehicle = null; }

    void BuildVehicle(VehicleType vehicleType)
    {
        VehicleFactory vf = new VehicleFactory();
        pVehicle = vf.build(vehicleType);
    }

    Vehicle getVehicle() { return pVehicle; }
}
