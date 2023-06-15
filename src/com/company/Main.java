package com.company;

public class Main {

    public static void main(String[] args) {
        Charger charger = new Charger();
        AdapterVoltage adapterVoltage = new AdapterVoltage(charger);

        adapterVoltage.connect();
    }
}
