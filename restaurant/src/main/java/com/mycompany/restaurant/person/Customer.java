
package com.mycompany.restaurant.person;

import com.mycompany.restaurant.food.Dish;
import com.mycompany.restaurant.food.Menu;
import com.mycompany.restaurant.values.CustomerRole;

public class Customer {
    private CustomerRole role;
    String id;
    String fullname;

    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
    
    void sayMenu(){
    
    }
    
    public float buyFood(){
        float finalprice;
        if(this.role == CustomerRole.TEACHER || this.role == CustomerRole.ADMINISTRATIVE ){
            finalprice = 7000;
            return finalprice;
        }
        else{
            finalprice = (float) Math.ceil(7000*0.3428);
        }
        
        return finalprice;
    }
    void lookQuanty(){
        
    }
    void cancelBuy(){
    
    }
    
    public void sellFood(){
        if(this.role != CustomerRole.ADMINISTRATIVE){
            System.out.println("Usted no tiene permiso");
            return;
        }
             System.out.println("one moment my friend");
    } 
}
