
package inheritence.and.polymorphysm;


class Bicycle{
    public
        int gear,cadence,speed;
        /*Bicycle(int startcadence,int startspeed,int startgear)//Gives pronlem when there is constructor as main method can't understand which to call class or constructor
        {
            gear=startgear;
            cadence=startcadence;
            speed=startspeed;
        }*/
        void startCadence(int newValue)
        {
            cadence=newValue;
            System.out.println("cadence in Bicycle "+cadence);
        }
        void startGear(int newValue)
        {
            gear=newValue;
        }
        void ApplyBreak(int decrement)
        {
            speed-=decrement;
        }
        void SpeedUp(int increment)
        {
            speed+=increment;
        }
}

class MountainBike extends Bicycle
{
    public
        int seatHeight;
        /*MountainBike(int startHeight,int startcadence,int startspeed,int startgear)
        {
            //super(startcadence,startspeed,startgear);
            seatHeight=startHeight;
        }*/
        void setHeight(int newValue)
        {
            seatHeight=newValue;
            System.out.println("seatHeight in MountainBike "+seatHeight);
            System.out.println("cadence in MountainBike "+cadence);
        }
}
public class Bike{
public static void main(String[] args)
{
    Bicycle b=new Bicycle();
    MountainBike m=new MountainBike();
    b.startCadence(15);
    m.setHeight(10);
    
}
}
