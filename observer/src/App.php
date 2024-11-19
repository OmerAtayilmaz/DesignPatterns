<?php

interface Subject { //publisher
   public function attach($observable) ;
   public function detach($observer);
   public function release();
}

interface Observer { //subscriber
    public function update();
}

class Login implements Subject {
    protected $observers = [];

    public function attach($observable) {

        if(is_array($observable)) {
            foreach ($observable as $observer) {

                if(!$observer instanceof Observer)
                    throw new Exception('Must be an instance of Observer');

                $this->attach($observer);
            }
            return;
        }

        $this->observers[] = $observable;
       

        return $this;
    }

    public function detach($observer) {
        $key = array_search($observer, $this->observers);
        if ($key !== false) {
            unset($this->observers[$key]);
        }
    }

    public function release() {
        foreach ($this->observers as $observer) {
            $observer->update();
        }
    }

    public function fire(){
        $this->release();
    }
}

class LogHandler implements Observer {
    public function update() {
        var_dump('LogHandler updated');
    }
}

class EmailNotifier implements Observer {
    public function update() {
        var_dump('Email Notifier updated');
    }
}

$login = new Login;
$login
->attach([
    new LogHandler,
    new EmailNotifier
]);

$login->fire();