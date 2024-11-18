<?php
require __DIR__ . '/../vendor/autoload.php'; 
use Acme\Adapter\Book;
use Acme\Adapter\BookX;
use Acme\Adapter\Kindle;
use Acme\Adapter\KindleAdapter;
use Acme\Adapter\Person; 

$book = new Book();
$bookX = new BookX();

$kindle = new Kindle();
$kindleAdapter = new KindleAdapter($kindle);

$person = new Person();

echo $person->read($kindleAdapter);