package com.nanoid;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

/**
 * JMH Benchmark suite for NanoID Java implementation.
 * 
 * This benchmark measures the performance of various NanoID generation scenarios
 * using the Java Microbenchmark Harness (JMH). The benchmarks cover:
 * - Default NanoID generation (21 characters, default alphabet)
 * - Custom length generation (10 characters, default alphabet)  
 * - Custom alphabet generation (21 characters, custom alphabet)
 * 
 * @author nanoid-java-benchmark contributors
 * @version 1.0.0
 */
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
@Fork(value = 0)  // Disable forking to avoid classpath issues in development
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 3, time = 2, timeUnit = TimeUnit.SECONDS)
public class NanoIdBenchmark {

    /**
     * Benchmark for default NanoID generation.
     * Generates a 21-character NanoID using the default alphabet.
     * 
     * @return Generated NanoID string
     */
    @Benchmark
    public String generateDefaultNanoId() {
        return NanoId.nanoid();
    }

    /**
     * Benchmark for custom length NanoID generation.
     * Generates a 10-character NanoID using the default alphabet.
     * 
     * @return Generated NanoID string
     */
    @Benchmark
    public String generateNanoId10() {
        return NanoId.nanoid(10);
    }

    /**
     * Benchmark for custom alphabet NanoID generation.
     * Generates a 21-character NanoID using a custom 6-character alphabet.
     * 
     * @return Generated NanoID string
     */
    @Benchmark
    public String generateCustomNanoId() {
        return NanoId.customNanoid("abcdef", 21);
    }

    /**
     * Benchmark for short NanoID generation.
     * Generates a 5-character NanoID using the default alphabet.
     * 
     * @return Generated NanoID string
     */
    @Benchmark
    public String generateShortNanoId() {
        return NanoId.nanoid(5);
    }

    /**
     * Benchmark for long NanoID generation.
     * Generates a 50-character NanoID using the default alphabet.
     * 
     * @return Generated NanoID string
     */
    @Benchmark
    public String generateLongNanoId() {
        return NanoId.nanoid(50);
    }

    /**
     * Benchmark for hex-only alphabet NanoID generation.
     * Generates a 16-character NanoID using hexadecimal characters only.
     * 
     * @return Generated NanoID string
     */
    @Benchmark
    public String generateHexNanoId() {
        return NanoId.customNanoid("0123456789abcdef", 16);
    }
}
