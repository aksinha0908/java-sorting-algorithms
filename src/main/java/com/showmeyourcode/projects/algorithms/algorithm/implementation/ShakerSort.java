package com.showmeyourcode.projects.algorithms.algorithm.implementation;

import com.showmeyourcode.projects.algorithms.algorithm.AlgorithmDataGenerator;
import com.showmeyourcode.projects.algorithms.algorithm.AlgorithmType;

public class ShakerSort extends AlgorithmBase {

    ShakerSort(AlgorithmDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public String getAlgorithmPerformance() {
        return "O(N)/O(N^2)";
    }

    @Override
    public String toString() {
        return "Shaker Sort ";
    }

    @Override
    public int[] sortData(int[] data) {
        if (data == null || data.length == 0) {
            return new int[]{};
        }

        int valToSwap, iLoop = 0;//i_loop means the same as int i in for loop
        boolean isSwapped;

        do {
            isSwapped = false;
            for (int j = iLoop; j < data.length - iLoop - 1; j++) {
                if (data[j] > data[j + 1]) {
                    valToSwap = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = valToSwap;
                    isSwapped = true;
                }
            }
            //means that array is sorted and we dont have to do more comparisions
            if (!isSwapped) break;
            for (int j = data.length - iLoop - 1; j > iLoop; j--) {
                if (data[j] < data[j - 1]) {
                    valToSwap = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = valToSwap;
                    isSwapped = true;
                }
            }
            iLoop++;
        } while (isSwapped);

        return data;
    }

    @Override
    public AlgorithmType getType() {
        return AlgorithmType.SHAKER_SORT;
    }
}
