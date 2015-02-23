package com.joantolos.cucumber;

/**
 *
 * Created by jtolos on 23/02/2015.
 */
public class Target {
    private int molecularWeight;

    public Target(int molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public String getTargetSize(int jumpingRepetitions) {
        if (molecularWeight > 10000 && jumpingRepetitions < 10) {
            return "be a big target";
        } else {
            return "be a tiny target";
        }
    }
}
