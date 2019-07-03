//Alan Kelsey
//alankelsey@u.boisestate.edu
//
//


public class Speedometer 
{
    
    double tireCircumference;
    double pulsesPerRotation;
    double pulsesSinceLastClock;
    double calculatedSpeed;

    //Tire circumference in inches
    public void setTireCircumference(double tireCircum )
    {
        double tireCircumfrence =  tireCircum ;

    }
    
    //indicates number of pulses per rotation
    public void setPulsesPerRotation(int rotation)
    {
        double pulsesPerRotation = rotation;
    }
    
    //used to count number magnets passes since last clock signal
    public void pulse()
    {
       

        
    }
    
   //called once per second and reset to zero after the pulse
   public void clock()
   {
        double clock = 1;
        double pulsesSinceLastClock = ++clock;
   }

   //retuns the most recent speed
   //formula take from
   //http://www.ehow.com/how_7514686_convert-tire-size-rpm-speed.html
   //or use d = r/t
   public double getSpeed()
   {
        double diameter = tireCircumference / 2;            
        double speed = (diameter * pulsesPerRotation) * 6.28;
        calculatedSpeed = speed;
       
       
        

        return calculatedSpeed;
   }
}
