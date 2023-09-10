package com.showmeyourcode.projects.algorithms.benchmark

enum TestBenchmarkData implements BenchmarkData {
    BROKEN_BENCHMARK_DATA("benchmark/file-does-not-exist.txt", 100000),
    SORTED_50K_BENCHMARK_DATA("benchmark/50000-sorted.txt", 50000);

    private final String path
    private final int size

    TestBenchmarkData(String path, int size) {
        this.path = path
        this.size = size
    }

    String getPath() {
        return path
    }

    int getSize() {
        return size
    }
}
