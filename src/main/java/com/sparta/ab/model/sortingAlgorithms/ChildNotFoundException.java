package com.sparta.ab.model.sortingAlgorithms;

public class ChildNotFoundException extends Exception{
    private String message;

    public ChildNotFoundException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return("This element isn't in the tree: " + message);
    }

}
