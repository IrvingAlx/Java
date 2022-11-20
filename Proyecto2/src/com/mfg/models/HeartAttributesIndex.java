package com.mfg.models;

public enum HeartAttributesIndex {
	AGE (0),
	SEX (1),
	TRESTBPS (2),
	CHOL (3),
	FBS (4),
	EXANG (5),
	TARGET (6);
	
    private int index;

    HeartAttributesIndex(int index) {
        this.index = index;
    }

    public static HeartAttributesIndex newInstance(int index) {
        for (HeartAttributesIndex HeartAttributesIndex : HeartAttributesIndex.values()) {
            if (index == HeartAttributesIndex.index) {
                return HeartAttributesIndex;
            }
        }
        throw new IllegalArgumentException("Index not found");
    }

    public int getIndex() {
        return index;
    }
}