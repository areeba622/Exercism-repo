public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0 ;
        
    }

    public int bonusMultiplier(int productsSold) { 
        return productsSold >= 20 ? 13 : 10 ;      // This will give either 13 or 10 
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold); // 13 or 10  
    }

    public double finalSalary(int daysSkipped, int productsSold) {   
     double salary = Math.round((1000 * salaryMultiplier( daysSkipped)) + bonusForProductsSold(productsSold));  
     return Math.min(salary , 2000.0); 
        
    } 
}
