/************************************
* GeometricObject                   *
*-----------------------------------*
* -color: String                    *
* -filled: boolean                  *
* -dateCreated: java.util.Date      *
*-----------------------------------*
* +GeometricObject()                *
* +GeometricObject(color: String,   *
*	filled: boolean)                 *
* +getColor(): String               *
* +setColor(color: Stirng): void    *
* +isFilled(): boolean              *
* +setFilled(filled: boolean): void *
* +getDateCreated(): java.util.Date *
* +toString(): String               *
************************************/
package Exm1;

import java.util.Date;

/**
 *
 * @author mahbub
 */
public class GeometricObject {
    private String color;
    private boolean filled;
    java.util.Date dateCreated;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
    return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    
    java.util.Date getDateCreatred(){
        return dateCreated;
    }
    
    public String toString(){
        return "Color\n"+color+ "Filled\n"+ filled+ "dateCreated\n"+ dateCreated;
    }
    
            
}
