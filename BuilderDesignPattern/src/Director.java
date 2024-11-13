public class Director {
    public Car buildEgea(CarBuilder builder){
        return builder.mileage(50d)
                .hasSunroof(false)
                .owner("France")
                .horsepower(500)
                .vin("AA2CD0")
                .build();
    }

    public Car buildTofas(CarBuilder builder){
        return builder.vin("AAAA")
                .horsepower(250)
                .owner("Turkiye")
                .licensePlate("asdasdas")
                .year(1995)
                .build();

    }
}
