package com.showmeyourcode.projects.algorithms.algorithm.implementation;

import com.showmeyourcode.projects.algorithms.algorithm.Algorithm;
import com.showmeyourcode.projects.algorithms.algorithm.AlgorithmType;
import com.showmeyourcode.projects.algorithms.test_util.DefaultComponentsProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;


class AlgorithmFactoryTest {

    AlgorithmFactory algorithmFactory;

    static Stream<Arguments> getAlgorithmTypeAndInstance() {
        return Stream.of(
                Arguments.of(AlgorithmType.BUBBLE_SORT, new BubbleSort(DefaultComponentsProvider.getDataGenerator())),
                Arguments.of(AlgorithmType.COUNTING_SORT, new CountingSort(DefaultComponentsProvider.getDataGenerator())),
                Arguments.of(AlgorithmType.HEAP_SORT, new HeapSort(DefaultComponentsProvider.getDataGenerator())),
                Arguments.of(AlgorithmType.INSERTION_SORT, new InsertionSort(DefaultComponentsProvider.getDataGenerator())),
                Arguments.of(AlgorithmType.MERGE_SORT, new MergeSort(DefaultComponentsProvider.getDataGenerator())),
                Arguments.of(AlgorithmType.QUICK_SORT, new QuickSort(DefaultComponentsProvider.getDataGenerator())),
                Arguments.of(AlgorithmType.SELECTION_SORT, new SelectionSort(DefaultComponentsProvider.getDataGenerator())),
                Arguments.of(AlgorithmType.COCKTAIL_SHAKER_SORT, new CocktailShakerSort(DefaultComponentsProvider.getDataGenerator())),
                Arguments.of(AlgorithmType.SHELL_SORT, new ShellSort(DefaultComponentsProvider.getDataGenerator()))
        );
    }

    @BeforeEach
    void setUp() {
        algorithmFactory = new AlgorithmFactory(DefaultComponentsProvider.getConfig());
    }

    @AfterEach
    void tearDown() {
        algorithmFactory = null;
    }

    @ParameterizedTest
    @MethodSource("getAlgorithmTypeAndInstance")
    void givePerformanceTest(AlgorithmType type, Algorithm algorithm) {
        assertTrue(algorithmFactory.createAlgorithm(type).getClass().isAssignableFrom(algorithm.getClass()));
    }
}
