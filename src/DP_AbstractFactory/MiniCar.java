package DP_AbstractFactory;

import javax.xml.stream.Location;

class MiniCar extends Car
{
    MiniCar(Location location)
    {
        super(CarType.MINI,location );
        construct();
    }

    @Override
    void construct()
    {
        System.out.println("Connecting to Mini car");
    }
}
