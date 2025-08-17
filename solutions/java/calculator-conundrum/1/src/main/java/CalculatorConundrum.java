class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            int sum ;
            switch(operation){

                case "+":
                   sum = operand1 + operand2;
                    String add = operand1 + " + " + operand2 + " = " + sum;
                    return add;
                  //  break;
                case "*":
                    sum = operand1 * operand2;
                    String multiply = operand1 + " * " + operand2 + " = " + sum;
                    return multiply;
                  //  break;
                case "/":
                    sum = operand1 /operand2;
                    String divide = operand1 + " / " + operand2 + " = " + sum;
                    return divide;
                 //   break;
                default :
                    System.out.println("Default method");
                    
            }}
      catch (ArithmeticException e ){
          throw new IllegalOperationException("Division by zero is not allowed", e);

//You can create your own exception (IllegalOperationException).

//By passing (message, cause) to super(message, cause), you wrap the original error so it isn’t lost.
          
      }


      
      
      catch (Exception e ){
          System.out.println("an error occured.");
      }
       
        finally {
                  System.out.println("Program Completed");
                }
      

       if (operation == null){
          throw new IllegalArgumentException ("Operation cannot be null");
      } 
        
      if (operation == ""){
          throw new IllegalArgumentException ("Operation cannot be empty");
      }

      if (operation != "+" || operation != "*" || operation != "/" ){
          throw new  IllegalOperationException ("Operation '" + operation + "' does not exist");
      }

      return "empty";
            
                    
            
            
        }
}


