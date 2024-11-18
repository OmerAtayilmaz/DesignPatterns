/*
class BasicInspection {

    public getPrice():number{
        return 30;
    }

}

class BasicInspectionAndOilChange{

    public getPrice():number {
        return 60;
    }
}

class BasicInspectionAndOilChangeAndTireRotation{
    public getPrice():number {
        return 100;
    }
}


class BasicInspectionAndOilChangeAndTireRotationAndFoo{
    public getPrice():number {
        return 110;
    }
}

*/
interface CarService{
    getPrice() : number;
}

class BasicInspection implements CarService {
    getPrice(): number {
        return 30;
    }
}

class OilChange implements CarService{

    oilChangePrice:number = 30;
    constructor(private carService: CarService){

    }
    getPrice(): number {
        return this.oilChangePrice + this.carService.getPrice();
    }

}

class TireRotation implements CarService{

    tireRotationPrice:number = 20;
    constructor(private carService: CarService){

    }
    getPrice(): number {
        return this.tireRotationPrice + this.carService.getPrice();
    }

}


let b = new BasicInspection();
let t = new TireRotation(b);
let o = new OilChange(t);

console.log(o.getPrice());