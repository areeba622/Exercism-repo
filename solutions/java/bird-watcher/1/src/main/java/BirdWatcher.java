
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        //int a = birdsPerDay.length-1 ;
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
      //  int a = ++(birdsPerDay[birdsPerDay.length-1]) ;  // access last index
       // int b = ++a;
        System.out.println(++(birdsPerDay[birdsPerDay.length-1]));  
        
    }

    public boolean hasDayWithoutBirds() {
        int i=0;
       while (i < birdsPerDay.length){
           if (birdsPerDay[i]==0){
           return true;}
        i++;}
        return false;
        

         
    }

    public int getCountForFirstDays(int numberOfDays) {
     int sum = 0;
     int add = 0;

     if   (numberOfDays >= birdsPerDay.length ){
         
                    for(int b = 0 ; b < birdsPerDay.length ; b++){
                        add+=birdsPerDay[b]; 
                    }
                    return add;
                }
     if  (numberOfDays <= birdsPerDay.length ){
         
            for(int i = 0 ; i < numberOfDays ; i++){ 
              sum+= birdsPerDay[i];  }
            
            return sum;}
        
            return 0;   
        
//To satisfy the compiler, you must include a default return statement.

//The return 0; will never actually run if your logic already covers all cases, //but it keeps the compiler happy ✅.

//👉 Quick tip: if you replace the second if with else, then the compiler sees all //paths are covered, and you wouldn’t need the final return 0;
        } 
   
            
    

    public int getBusyDays() {
    int days = 0 ;
        
        for (int i = 0 ; i < birdsPerDay.length ; i++ ){
            if (birdsPerDay[i] >= 5){
                ++days ;
            }
                     }
            return days;
        
         
    }
}
