package com.showmeyourcode.projects.algorithms.benchmark;

import com.showmeyourcode.projects.algorithms.exception.BenchmarkDataNotFoundException;
import com.showmeyourcode.projects.algorithms.test_util.DefaultComponentsProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmsBenchmarkDataGeneratorTest {

    @Test
    void should_loadBenchmarkData_when_fileExists() throws BenchmarkDataNotFoundException, IOException {
        var benchmarkDataGenerator = new BenchmarkDataGenerator(DefaultComponentsProvider.getConfig());

        int[] loadedData = benchmarkDataGenerator.loadData(AlgorithmsBenchmarkData.FIFTY_THOUSANDS);

        assertEquals(50000, loadedData.length);
    }

    @Test
    void should_failLoadingData_when_fileDoesNotExist() {
        var benchmarkDataGenerator = new BenchmarkDataGenerator(DefaultComponentsProvider.getConfig());

        Assertions.assertThrows(BenchmarkDataNotFoundException.class, () -> {
            benchmarkDataGenerator.loadData(TestBenchmarkData.BROKEN_BENCHMARK_DATA);
        });
    }
}
