package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean cheese;
    boolean takeaway;
    boolean toppings;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)this.price=300;
        else this.price=400;
        cheese=false;
        takeaway=false;
        toppings=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese){
            price+=80;
            cheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings) {
            if (isVeg) price +=70;
            else price+=120;
            toppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway)
        {
            price+=20;
            takeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg)
            bill="Base Price Of The Pizza: 300\n";
        if(!isVeg)
            bill="Base Price Of The Pizza: 400\n";
        if(cheese)
              bill+="Extra Cheese Added: 80\n";
        if(toppings && isVeg)
            bill+="Extra Toppings Added: 70\n";
        if(toppings && !isVeg)
            bill+="Extra Toppings Added: 120\n";
        if(takeaway)
              bill+="Paperbag Added: 20\n";
             bill+="Total Price: "+price;
        return this.bill;

    }
}
