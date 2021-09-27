package com.example.demoSpringDI;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Cake {
Flavor flavor; 




@Autowired
public Cake(Flavor flavor) {
	// TODO Auto-generated constructor stub
	this.flavor=flavor;
}
public Cake() {
	// TODO Auto-generated constructor stub
}
public Flavor getFlavor() {
	return flavor;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cake [ flavor= "+ flavor +"]";
	}
}


/**
 *
 Flavor  f = new Flavor()
 * Cake c = new Cake(f)
 * /
 */