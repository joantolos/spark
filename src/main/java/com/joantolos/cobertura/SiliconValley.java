package com.joantolos.cobertura;

/**
 *  
 * Created by u6019943 on 10/04/2015.
 */
public class SiliconValley {
    private Method method;
    
    public SiliconValley(Method method){
        this.method = method;
    }
    
    public boolean changeTheWorld(){
        if(this.method.equals(Method.AGILE)){
            return true;
        }else{
            return false;
        }
    }
}
