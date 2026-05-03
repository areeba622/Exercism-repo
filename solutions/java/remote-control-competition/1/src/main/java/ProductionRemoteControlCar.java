class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>  {
int prodDrive = 0;
private int numberOfVictories = 0;
    
@Override
    public void drive() {
        prodDrive +=10;
    }
    
@Override
    public int getDistanceTravelled() {
        return prodDrive;
    }

    public int getNumberOfVictories() {
         return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;}

        public int compareTo (ProductionRemoteControlCar other){           //?
            return Integer.compare(other.numberOfVictories,  this.numberOfVictories);

         //   task 4 ???
        
    }
}
