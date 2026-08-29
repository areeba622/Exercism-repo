class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
       return 1;
    }
}

// TODO: define the Warrior class

class Warrior extends Fighter  {
    
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
     int getDamagePoints(Fighter fighter) {
       return fighter.isVulnerable() ? 10 : 6 ;
    }
    
}

// TODO: define the Wizard class

class Wizard extends Fighter {

    boolean vulnerable = true ;
    
    public String toString(){
        return "Fighter is a Wizard";
    }
    
    @Override
    boolean isVulnerable() {
    return vulnerable  ;
    }

     boolean  prepareSpell() {
       return vulnerable = false ;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
       return vulnerable ? 3 : 12 ;
    }
}
