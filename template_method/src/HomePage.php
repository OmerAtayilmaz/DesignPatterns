<?php 
namespace App;

class HomePage extends Page {

    public function loadContent() {
        echo "Dynamic content loaded\n";
        return $this;
    }

}
