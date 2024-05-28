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


    private boolean property_color(Card A, Card B)
    {

        return (this.color.equals(A.color) & A.color.equals(B.color)) |
                (!this.color.equals(A.color) & !A.color.equals(B.color) & !this.color.equals(B.color));
    }

    private boolean property_quantity(Card A, Card B)
    {

        return (this.quantity == A.quantity & A.quantity == B.quantity) |
                (this.quantity !=A.quantity & A.quantity != B.quantity & this.quantity !=B.quantity);
    }

    private boolean property_texture(Card A, Card B)
    {

        return (this.texture.equals(A.texture) & A.texture.equals(B.texture)) |
                (!this.texture.equals(A.texture) & !A.texture.equals(B.texture) & !this.texture.equals(B.texture));

    }

    private boolean property_symbol(Card A, Card B)
    {

        return (this.symbol.equals(A.symbol) & A.symbol.equals(B.symbol)) |
                (!this.symbol.equals(A.symbol) & !A.symbol.equals(B.symbol) & !this.symbol.equals(B.symbol));
    }

    private boolean property_all(Card A, Card B)
    {

        return !(this.equals(A)) &!(this.equals(B))&!(B.equals(A));
    }

    public boolean property(Card A, Card B){
        return this.property_color(A, B) & this.property_quantity(A, B) & this.property_texture(A, B) & this.property_symbol(A, B) & this.property_all(A,B);
    }







}
