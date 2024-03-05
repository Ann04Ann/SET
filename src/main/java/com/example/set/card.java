package com.example.set;

public class card {

    String name;
    String color;
    String quantity;
    String texture;
    String symbol;
    public card(String name, String color, String quantity, String texture, String symbol) {
        this.name = name;
        this.color = color;
        this.quantity = quantity;
        this.texture = texture;
        this.symbol = symbol;
    }


    public boolean property_color(card A, card B)
    {
        boolean ans;
        if ((this.color == A.color && A.color==B.color)||
                (this.color != A.color && A.color!=B.color&& this.color!=B.color)){
           ans =  true;
        }
        else{
            ans = false;
        }
        return ans;
    }

    public boolean property_quantity(card A, card B)
    {
        boolean ans;
        if ((this.quantity == A.quantity && A.quantity==B.quantity)||
                (this.quantity != A.quantity && A.quantity!=B.quantity&& this.quantity!=B.quantity)){
            ans =  true;
        }
        else{
            ans = false;
        }
        return ans;
    }

    public boolean property_texture(card A, card B)
    {
        boolean ans;
        if ((this.texture == A.texture && A.texture==B.texture)||
                (this.texture != A.texture && A.texture!=B.texture&& this.texture!=B.texture)){
            ans =  true;
        }
        else{
            ans = false;
        }
        return ans;
    }

    public boolean property_symbol(card A, card B)
    {
        boolean ans;
        if ((this.symbol == A.symbol && A.symbol==B.symbol)||
                (this.symbol != A.symbol && A.symbol!=B.symbol&& this.symbol!=B.symbol)){
            ans =  true;
        }
        else{
            ans = false;
        }
        return ans;
    }


    public boolean property(card A, card B){
        boolean ans;
        if(this.property_color(A,B) && this.property_quantity(A,B) && this.property_texture(A,B) &&  this.property_symbol(A,B) )
        {
            ans =  true;
        }
        else{
            ans = false;
        }
        return ans;
    }







}
