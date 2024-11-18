<?php
namespace Acme\Adapter;

interface BookInterface {
    public function open();
    public function turnPage();
}
interface KindleInterface{
    public function turnOn();
    public function pressNextButton();
}


class Book implements BookInterface {
    public function open() {
        return 'Opening the paper book.';
    }

    public function turnPage() {
        return 'Turning the page of the paper book.';
    }
}

class BookX implements BookInterface {
    public function open() {
        return 'Opening the x-book.';
    }

    public function turnPage() {
        return 'Turning the page of the x-book.';
    }
}


class Kindle implements KindleInterface {

    public function turnOn() {
        return 'Turning on the kindle.';
    }

    public function pressNextButton() {
        return 'Pressing the next button on the kindle.';
    }
}

class KindleAdapter implements BookInterface {
    protected $kindle;

    public function __construct(KindleInterface $kindle) {
        $this->kindle = $kindle;
    }

    public function open() {
        return $this->kindle->turnOn();
    }

    public function turnPage() {
        return $this->kindle->pressNextButton();
    }
}

class Person {
    public function read(BookInterface $book) :void{
        echo $book->open();
        echo $book->turnPage();
    }
}