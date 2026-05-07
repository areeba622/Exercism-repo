class Badge {

    Integer id;
    String name;
    String dept;
    
    
    public String print(Integer id, String name, String dept) {
       
       String ID = (id != null) ? "["+id+"]" + " - " + name  : name ;
       String checkowner = (dept != null) ? " - " + dept.toUpperCase() : " - OWNER"; 

        return ID + checkowner;
    }
}

/*Print will take name , id , dept

=> (254, "Charlotte Hale", null); id!=null , dept=null(Owner)
=> (null, "Charlotte Hale", null); id=null , dept=null(Owner)

=> (null, "Jane Johnson", "Procurement"); id=null , 
=> (734, "Ernest Johnny Payne", "Strategic Communication"); id!=null , 
*/