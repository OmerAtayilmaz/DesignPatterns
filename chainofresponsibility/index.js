var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var AbstractHandler = /** @class */ (function () {
    function AbstractHandler() {
        this.nextHandler = null;
    }
    AbstractHandler.prototype.setNext = function (handler) {
        this.nextHandler = handler;
        return handler; // Zincirleme için bu döndürülüyor.
    };
    AbstractHandler.prototype.handle = function (request) {
        if (this.nextHandler) {
            return this.nextHandler.handle(request);
        }
        return null;
    };
    return AbstractHandler;
}());
var GeneralSupport = /** @class */ (function (_super) {
    __extends(GeneralSupport, _super);
    function GeneralSupport() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    GeneralSupport.prototype.handle = function (request) {
        if (request == 'genel destek') {
            return 'Genel desteğe bağlanılıyor...';
        }
        return _super.prototype.handle.call(this, request);
    };
    return GeneralSupport;
}(AbstractHandler));
var TechnicalSupport = /** @class */ (function (_super) {
    __extends(TechnicalSupport, _super);
    function TechnicalSupport() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    TechnicalSupport.prototype.handle = function (request) {
        if (request == 'teknik destek') {
            return 'Teknik desteğe bağlanılıyor...';
        }
        return _super.prototype.handle.call(this, request);
    };
    return TechnicalSupport;
}(AbstractHandler));
var ManagerSupport = /** @class */ (function (_super) {
    __extends(ManagerSupport, _super);
    function ManagerSupport() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    ManagerSupport.prototype.handle = function (request) {
        if (request == 'yonetici destek') {
            return 'Yönetici desteğe bağlanılıyor...';
        }
        return _super.prototype.handle.call(this, request);
    };
    return ManagerSupport;
}(AbstractHandler));
//structure end
var generalSupport = new GeneralSupport();
;
var technicalSupport = new TechnicalSupport();
var managerSupport = new ManagerSupport();
var result = generalSupport.setNext(technicalSupport).setNext(managerSupport);
var requests = ['genel destek', 'teknik destek', 'yönetici destek', 'bilinmeyen destek'];
requests.forEach(function (request) {
    console.log("\n\u0130stek: ".concat(request));
    var result = generalSupport.handle(request);
    if (result) {
        console.log("  Cevap: ".concat(result));
    }
    else {
        console.log('  Cevap: İstek zincirde işlenemedi.');
    }
});
