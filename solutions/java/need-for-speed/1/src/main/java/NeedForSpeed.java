
class NeedForSpeed {
  public int speed;
  public int batteryDrain;

    int carDrive = 0; // gives normal car distance in meters
    int fullCarBattery = 100 ; // normal car full battery
    boolean drived = false;

    boolean normalCar = false;

    
    NeedForSpeed(int speed, int batteryDrain) { 
     this.speed = speed;
     this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (drived){
        if (fullCarBattery >= batteryDrain){
            return false;
        }
        else{
            return true;
        }}
        else{
            return false;
        }
    }

    public int distanceDriven() {
        if (normalCar){
        if (fullCarBattery>=0 ){  // if car battery above 0
            return carDrive;
        }
        else {return carDrive;}      }   // if car battery less than 0

   
        else {
            return 0 ;
        }
    }

    public void drive() {
        normalCar = true;
        drived = true;
        if (fullCarBattery != 0 ){
       carDrive += speed;}
       fullCarBattery -= batteryDrain;
       
    }

    public static NeedForSpeed nitro() {
  //      nitroCar = true;
       return  new NeedForSpeed (50,4); // ?
            
    }
}

class RaceTrack {
    int distance;
    

    RaceTrack(int distance){
       this.distance = distance;}
       
    

    public boolean canFinishRace(NeedForSpeed car) {
        int BatteryDrain = car.batteryDrain;
       int Speed = car.speed;
       int maxDistance = (100 / BatteryDrain) * Speed;
        if (maxDistance >= distance ){
            return true;
        }
        else {
            return false;
        }
    }
    }

