package exercises;
//Create an interface FlyingObject 
//Declare the property maxSpeed, maxAltitude. 
//Declare the methods of flying object takeOff(), land(), capacity(), flyHigh() 
//Create 2 classes which implements the Interface.
//Caller should create the objects of both the classes.
//Caller method should keep on calling flyHigh() method till maxAltitude is not reached.
//Once maxAltitude is reached, land() method should be called. 

public interface Exercise14IFlyingObject {
    int maxSpeed = 400;
    int maxAltitude = 20000;
     
    void takeOff();
    void land();
    int capacity();
    int flyHigh();
    int currentAltitude();
}