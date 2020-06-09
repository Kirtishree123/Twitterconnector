package com.elasticsearch.type;

public enum SentimentType {

    VERY_NEGATIVE(0), NEGATIVE(1), NEUTRAL(2), POSITIVE(3), VERY_POSITIVE(4);

    public int value;

    private SentimentType(int value) {
        this.value = value;
    }

    public static SentimentType fromValue(int value) {
        for (SentimentType typeSentiment: values()) {
            if (typeSentiment.value == value) {
                return typeSentiment;
            }
        }
      //System.out.println(SentimentType.values());
        return SentimentType.NEUTRAL;
    }
}
