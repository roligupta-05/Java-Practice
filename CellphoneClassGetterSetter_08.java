package com.company;
class Cellphone {
    public void ringing() {
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
    public void callFriend() {
        System.out.println("Calling Friend...");
    }
}

public class CellphoneClassGetterSetter_08 {
    public static void main(String[] args) {
        Cellphone iPhone = new Cellphone();
        iPhone.ringing();
        iPhone.vibrate();
        iPhone.callFriend();
    }
    
}
