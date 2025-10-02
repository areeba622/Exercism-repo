
    


public class ExperimentalRemoteControlCar implements RemoteControlCar {
int expDrive = 0;
    
@Override
    public void drive() {
        expDrive +=20;
        
    }
@Override
    public int getDistanceTravelled() {
        return expDrive;
    }
}
