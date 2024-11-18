<?php 
namespace App;


class AboutPage extends Page {
   

    public function loadContent() {
        echo "Static content loaded\n";
        return $this;
    }

   
}