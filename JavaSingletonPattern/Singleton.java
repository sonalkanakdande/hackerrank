package JavaSingletonPattern;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{

    private Singleton(){
    }
    
    public static String str;
 
    private static final Singleton INSTANCE = new Singleton();
    
    public static Singleton getSingleInstance() {
        return INSTANCE;
    }
}