package com.mygdx.game.data.materials;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Metal extends Material {
    private static Metal instance = new Metal();
    private int value = DEFAULT_VALUE;

    private Metal() {
    }

    public synchronized static Metal getInstance() {
        return instance;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void reset() {
        value = DEFAULT_VALUE;
    }

    @Override
    public synchronized void increasedValue(int increasedAmount) {
        value += increasedAmount;
    }

    @Override
    public synchronized void decreasedValue(int decreasedAmount) {
        value -= decreasedAmount;
    }
}
