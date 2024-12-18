<?php

// autoload_real.php @generated by Composer

class ComposerAutoloaderInite17240d8db2480b6ff2c3aace3384baf
{
    private static $loader;

    public static function loadClassLoader($class)
    {
        if ('Composer\Autoload\ClassLoader' === $class) {
            require __DIR__ . '/ClassLoader.php';
        }
    }

    /**
     * @return \Composer\Autoload\ClassLoader
     */
    public static function getLoader()
    {
        if (null !== self::$loader) {
            return self::$loader;
        }

        spl_autoload_register(array('ComposerAutoloaderInite17240d8db2480b6ff2c3aace3384baf', 'loadClassLoader'), true, true);
        self::$loader = $loader = new \Composer\Autoload\ClassLoader(\dirname(__DIR__));
        spl_autoload_unregister(array('ComposerAutoloaderInite17240d8db2480b6ff2c3aace3384baf', 'loadClassLoader'));

        require __DIR__ . '/autoload_static.php';
        call_user_func(\Composer\Autoload\ComposerStaticInite17240d8db2480b6ff2c3aace3384baf::getInitializer($loader));

        $loader->register(true);

        return $loader;
    }
}
