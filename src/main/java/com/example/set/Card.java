package com.example.set;

public class Card {

    String name;
    String color;
    String quantity;
    String texture;
    String symbol;

    public Card(String name, String color, String quantity, String texture, String symbol) {
        this.name = name;
        this.color = color;
        this.quantity = quantity;
        this.texture = texture;
        this.symbol = symbol;

    }


    public boolean property_color(Card A, Card B)
    {
        boolean ans;
        ans = (this.color.equals(A.color) & A.color.equals(B.color)) |
                (!this.color.equals(A.color) & !A.color.equals(B.color) & !this.color.equals(B.color));
        return ans;
    }

    public boolean property_quantity(Card A, Card B)
    {
        boolean ans;
        ans = (this.quantity.equals(A.quantity) & A.quantity.equals(B.quantity)) |
                (!this.quantity.equals(A.quantity) & !A.quantity.equals(B.quantity) & !this.quantity.equals(B.quantity));
        return ans;
    }

    public boolean property_texture(Card A, Card B)
    {
        boolean ans;
        ans = (this.texture.equals(A.texture) & A.texture.equals(B.texture)) |
                (!this.texture.equals(A.texture) & !A.texture.equals(B.texture) & !this.texture.equals(B.texture));
        return ans;
    }

    public boolean property_symbol(Card A, Card B)
    {
        boolean ans;
        ans = (this.symbol.equals(A.symbol) & A.symbol.equals(B.symbol)) |
                (!this.symbol.equals(A.symbol) & !A.symbol.equals(B.symbol) & !this.symbol.equals(B.symbol));
        return ans;
    }


    public boolean property(Card A, Card B){
        boolean ans;
        ans = this.property_color(A, B) & this.property_quantity(A, B) & this.property_texture(A, B) & this.property_symbol(A, B);
        return ans;
    }







}
