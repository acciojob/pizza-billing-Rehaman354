package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean cheese;
    boolean takeaway;
    boolean toppings;
    boolean dp=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg)this.price=300;
        else this.price=400;
        this.cheese=false;
       this.takeaway=false;
       this.toppings=false;
    }
    public Pizza(Boolean isVeg,boolean b){
        this.dp=b;
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true)
            this.price=300;
        else
            this.price=400;
        this.cheese=true;
        this.takeaway=false;
        this.toppings=true;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.cheese){
            price+=80;
            this.cheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.toppings) {
            if (isVeg) price +=70;
            else price+=120;
            this.toppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.takeaway)
        {
            price+=20;
            this.takeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(this.isVeg)
            bill="Base Price Of The Pizza: 300\n";
        if(!this.isVeg)
            bill="Base Price Of The Pizza: 400\n";
        if(this.cheese)
              bill+="Extra Cheese Added: 80\n";
        if(this.toppings && this.isVeg)
            bill+="Extra Toppings Added: 70\n";
        if(this.toppings && !this.isVeg)
            bill+="Extra Toppings Added: 120\n";
        if(this.takeaway)
              bill+="Paperbag Added: 20\n";
        if(this.dp) {
            this.price += 80;//cheese
            if (this.isVeg) this.price += 70;
            else this.price += 120;
        }
             bill+="Total Price: "+this.price+"\n";
        return this.bill;

    }
}
