var BasicInspection = /** @class */ (function () {
    function BasicInspection() {
    }
    BasicInspection.prototype.getPrice = function () {
        return 30;
    };
    return BasicInspection;
}());
var OilChange = /** @class */ (function () {
    function OilChange(carService) {
        this.carService = carService;
        this.oilChangePrice = 30;
    }
    OilChange.prototype.getPrice = function () {
        return this.oilChangePrice + this.carService.getPrice();
    };
    return OilChange;
}());
var TireRotation = /** @class */ (function () {
    function TireRotation(carService) {
        this.carService = carService;
        this.tireRotationPrice = 20;
    }
    TireRotation.prototype.getPrice = function () {
        return this.tireRotationPrice + this.carService.getPrice();
    };
    return TireRotation;
}());
var b = new BasicInspection();
var t = new TireRotation(b);
var o = new OilChange(t);
console.log(o.getPrice());
