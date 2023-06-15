package com.company;


public class AdapterVoltage implements Voltage{

    private Charger charger;
    public AdapterVoltage(Charger charger){
        this.charger = charger;
    }

    @Override
    public void connect() {
        charger.charge();
        System.out.println("Адаптер преобразует напряжение 380v в 220v для зарядки телефона");
    }
}
