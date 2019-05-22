package ende;

class Jugador{
	
	
	 int éxitos;     
	 int winTotal;
    
    public String opcion_al_azar()
    {
        String opcion = "";
        int c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion = ("piedra");
                break;
            case 1:
            	opcion = ("papel");
                break;
            case 2:
            	opcion = ("tijeras");
            	break;
            default:
            	opcion = ("Incorrecto");
        }
        return opcion;
    }
    public void setÉxitos() 
    {
        éxitos++;
    }
    public int getÉxitos() 
    {
        return(éxitos);
    }
    
   
}
