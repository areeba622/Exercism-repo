public class JedliksToyCar {
 int distance = 0;
 int battery = 100;
 boolean displaybatteryfull = false;
 boolean driving = false;

    
    
    
    public static JedliksToyCar buy() {
        
        return new JedliksToyCar();   // new object created of class
    }

    public String distanceDisplay() {
        if (driving){
            if (distance < 2000){
            return "Driven " + distance + " meters";
            
        }
        else {
            return "Driven 2000 meters";
        }
        }
            
        else {
            return "Driven 0 meters";
        }
        
    }
    
    public String batteryDisplay() {
      if (displaybatteryfull) {
          if (distance < 2000){
              return "Battery at " + battery + "%";
          }
          else{
              return "Battery empty";
          }
      }
     else {
         return "Battery at 100%";
     }   
      
     
    }

    public void drive() {
        battery -= 1;
       distance +=20; 
        displaybatteryfull = true;
        driving = true;
        
      
        
    
        
    }
}
