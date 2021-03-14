package com.showmeyourcode.projects.algorithms.algorithm.implementation;

import com.showmeyourcode.projects.algorithms.algorithm.AlgorithmDataGenerator;
import com.showmeyourcode.projects.algorithms.algorithm.AlgorithmType;

public class ShellSort extends AlgorithmBase {

    ShellSort(AlgorithmDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public String getAlgorithmPerformance() {
        return "UNDEFINED";
    }

    @Override
    public int[] sortData(int[] data) {
        if (data == null || data.length == 0) {
            return new int[]{};
        }
        int valToSwap, iHole = data.length / 2;
        //start from top to down
        while (iHole > 0) {
            for (int j = iHole; j < data.length; j++) {
                if (data[j] < data[j - iHole]) {
                    valToSwap = data[j];
                    data[j] = data[j - iHole];
                    data[j - iHole] = valToSwap;
                    for (int i = 0; iHole == 1 && j - iHole - 1 - i >= 0 && data[j - iHole - i] < data[j - iHole - i - 1]; i++) {
                        valToSwap = data[j - iHole - i];
                        data[j - iHole - i] = data[j - iHole - i - 1];
                        data[j - iHole - i - 1] = valToSwap;
                    }
                }
            }
            iHole = iHole / 2;
        }

        return data;
    }

    @Override
    public AlgorithmType getType() {
        return AlgorithmType.SHELL_SORT;
    }

    @Override
    public String toString() {
        return "Shell Sort ";
    }
}
