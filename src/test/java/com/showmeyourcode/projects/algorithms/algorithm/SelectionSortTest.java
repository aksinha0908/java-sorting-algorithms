package com.showmeyourcode.projects.algorithms.algorithm;

import com.showmeyourcode.projects.algorithms.test_util.StaticValueProvider;
import org.junit.jupiter.api.BeforeEach;

class SelectionSortTest extends AlgorithmTestClassBase {

    @BeforeEach
    @Override
    void setProperAlgorithm() {
        this.algorithm = new SelectionSort(StaticValueProvider.getDataGenerator());
    }
}
