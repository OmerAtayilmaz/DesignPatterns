interface Handler {
    setNext(next: Handler): Handler;
    handle(request: string) : string | null;
}

abstract class AbstractHandler implements Handler {
    private nextHandler: Handler | null = null;
    public setNext(handler: Handler): Handler {
        this.nextHandler = handler;
        return handler;  // Zincirleme için bu döndürülüyor.
      }
      public handle(request: string): string | null {
        if (this.nextHandler) {
          return this.nextHandler.handle(request);
        }
        return null;
      }
}

class GeneralSupport extends AbstractHandler {
    public handle(request: string): string | null {
        if(request == 'genel destek'){
            return 'Genel desteğe bağlanılıyor...';
        }

        return super.handle(request);
    }
}


class TechnicalSupport extends AbstractHandler {
    public handle(request: string): string | null {
        if(request == 'teknik destek'){
            return 'Teknik desteğe bağlanılıyor...';
        }
        return super.handle(request);
    }

}


class ManagerSupport extends AbstractHandler {
    public handle(request: string) : string | null{
        if(request == 'yonetici destek'){
            return 'Yönetici desteğe bağlanılıyor...';
        }
        return super.handle(request);
    }
}
//structure end


const generalSupport = new GeneralSupport();;
const technicalSupport = new TechnicalSupport();
const managerSupport = new ManagerSupport();

let result = generalSupport.setNext(technicalSupport).setNext(managerSupport);


const requests = ['genel destek', 'teknik destek', 'yönetici destek', 'bilinmeyen destek'];

requests.forEach((request) => {
  console.log(`\nİstek: ${request}`);
  const result = generalSupport.handle(request);
  if (result) {
    console.log(`  Cevap: ${result}`);
  } else {
    console.log('  Cevap: İstek zincirde işlenemedi.');
  }
});
