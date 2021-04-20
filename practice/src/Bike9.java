//Example of final variable
public class Bike9 {
    final int speedLimit =90; //final variable
    void run(){
        speedLimit = 400;
        //Changing the value of final variable speed limit wont work because its
        //already been assigned and can never be changed
    }
}

