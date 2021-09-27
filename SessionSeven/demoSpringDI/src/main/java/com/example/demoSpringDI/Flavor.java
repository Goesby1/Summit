package com.example.demoSpringDI;

import org.springframework.stereotype.Component;

@Component
public class Flavor {
String flavorType="spicy";
String color="default";
public String getColor() {
	return color;
}
public String getFlavorType() {
	return flavorType;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Flavor [flavorType=" + flavorType +", color= "+color+ "]";
	}
}
