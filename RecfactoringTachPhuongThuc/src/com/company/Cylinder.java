package com.company;

public class Cylinder {
    public double getVolume(double radius,double height){
        double baseArea=getBaseArea(radius);
        double perimeter=getPerimeter(radius);
        double volume=perimeter*height+2*baseArea;
        return volume;
    }
    public static double getBaseArea(double radius){
        return Math.PI*radius*radius;
    }
    public static double getPerimeter(double radius){
        return Math.PI*2*radius;
    }

}
