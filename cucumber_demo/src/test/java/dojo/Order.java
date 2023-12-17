package dojo;

import java.util.List;
import java.util.ArrayList;

public class Order {

    private String owner;
    private String target;
    private List<String> cocktails;

    public Order() {
        this.owner = null;
        this.target = null;
        this.cocktails = new ArrayList<String>();
    }

    public Order(String owner, String target) {
        this.owner = owner;
        this.target = target;
    }

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return this.target;
    }

    public void declareCocktails(List<String> cocktails) {
        this.cocktails = cocktails;
    }

    public List<String> getCocktails() {
        return this.cocktails;
    }
}