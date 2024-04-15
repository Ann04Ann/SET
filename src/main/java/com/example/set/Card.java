package com.example.set;

import javafx.scene.image.Image;

public class Card {

    String symbol;
    String color;
    String texture;
    int quantity;
    Image image;

    public Card(String symbol, String color, String texture, int quantity, Image image) {

        this.color = color;
        this.quantity = quantity;
        this.texture = texture;
        this.symbol = symbol;
        this.image = image;


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
        ans = (this.quantity == A.quantity & A.quantity == B.quantity) |
                (this.quantity !=A.quantity & A.quantity != B.quantity & this.quantity !=B.quantity);
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

    public boolean property_all(Card A, Card B)
    {
        boolean ans;
        ans = !(this.equals(A)) &!(this.equals(B))&!(B.equals(A));
        return ans;
    }

    public boolean property(Card A, Card B){
        boolean ans;
        ans = this.property_color(A, B) & this.property_quantity(A, B) & this.property_texture(A, B) & this.property_symbol(A, B) & this.property_all(A,B);
        return ans;
    }







}
