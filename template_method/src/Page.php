<?php 
namespace App;

abstract class Page {
    public function __construct() {
        $this
            ->addHeader()
            ->loadMetaTags()
            ->loadStyles()
            ->loadScripts()
            ->addBody()
            ->loadContent()
            ->addFooter();
    }

    public function addHeader() {
        echo "Header added\n";
        return $this;
    }

    public function loadMetaTags() {
        echo "Meta tags loaded\n";
        return $this;
    }

    public function loadStyles() {
        echo "Styles loaded\n";
        return $this;
    }

    public function loadScripts() {
        echo "Scripts loaded\n";
        return $this;
    }

    public function addBody() {
        echo "Body added\n";
        return $this;
    }

    public abstract function loadContent(); 

    public function addFooter() {
        echo "Footer added\n";
        return $this;
    }
}
