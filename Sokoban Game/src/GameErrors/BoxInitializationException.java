package GameErrors;

public class BoxInitializationException extends Exception{
    public BoxInitializationException(){
        super("No boxes were initialized");
    }
    public BoxInitializationException(String s){
        super(s);
    }
}
