class Badge {

    Integer id;
    String name;
    String dept;
    
    
    public String print(Integer id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept ;
        String result = "";

        if (id != null && dept != null){
            result = "["+id+"]" + " - " + name + " - " + dept.toUpperCase();
        }
        if (id == null && dept != null){
             result =  name + " - " + dept.toUpperCase();
        }
        if ( id != null && dept == null){
             result = "["+id+"]" + " - " + name + " - " + "OWNER" ;
        }
        if ( id == null && dept == null){
             result =  name + " - " + "OWNER" ;
        }

        return result ;      
    }
}

/*Print will take name , id , dept

=> (254, "Charlotte Hale", null); id!=null , dept=null(Owner)
=> (null, "Charlotte Hale", null); id=null , dept=null(Owner)

=> (null, "Jane Johnson", "Procurement"); id=null , 
=> (734, "Ernest Johnny Payne", "Strategic Communication"); id!=null , 
*/