package com.mfg.models;

public enum WeatherAttributesIndex {
    CLIMA (0),
    VIVECONPADRES (1),
    SITUACIONACADEMICA (2),
    PANORAMA (3);

    private int index;

    WeatherAttributesIndex(int index) {
        this.index = index;
    }

    public static WeatherAttributesIndex newInstance(int index) {
        for (WeatherAttributesIndex weatherAttributesIndex : WeatherAttributesIndex.values()) {
            if (index == weatherAttributesIndex.index) {
                return weatherAttributesIndex;
            }
        }
        throw new IllegalArgumentException("Index not found");
    }

    public int getIndex() {
        return index;
    }
}