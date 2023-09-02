package main;

import domain.BinaryPersistence;
import domain.Drawing;
import domain.Persistence;
import domain.XMLPersistence;

public class Startup{
	public static void main(String args[]) {
        new Startup().run();
    }

    private void run() {
        Persistence p = new Persistence(new XMLPersistence());
        p.geefReader().read("test");
        p.geefWriter().write(new Drawing(), "test2");
        
        Persistence o = new Persistence(new BinaryPersistence());
        o.geefReader().read("test3");
        o.geefWriter().write(new Drawing(), "test4");
    }
} 