# NanoID Java Benchmark

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A comprehensive benchmark suite for nanoid-java using [JMH (Java Microbenchmark Harness)](https://openjdk.java.net/projects/code-tools/jmh/), providing performance measurements for NanoID generation operations.

## Overview

This project benchmarks the performance of the [nanoid-java](https://github.com/albahrani/nanoid-java) library, measuring throughput and timing statistics for various NanoID generation scenarios.

## Prerequisites

- JDK 17 or higher
- Apache Maven 3.6.0 or higher

## Quick Start

1. **Clone the repository:**
   ```bash
   git clone https://github.com/albahrani/nanoid-java-benchmark.git
   cd nanoid-java-benchmark
   ```

2. **Build the project:**
   ```bash
   mvn clean compile
   ```

3. **Run all benchmarks:**
   ```bash
   mvn exec:java
   ```

## Benchmark Scenarios

The benchmark suite includes the following test scenarios:

| Benchmark | Description | Method |
|-----------|-------------|---------|
| **Default NanoID** | Standard 21-character NanoID with default alphabet | `NanoId.nanoid()` |
| **Custom Length** | 10-character NanoID with default alphabet | `NanoId.nanoid(10)` |
| **Custom Alphabet** | 21-character NanoID with custom alphabet (`abcdef`) | `NanoId.customNanoid("abcdef", 21)` |

## Running Specific Benchmarks

You can run specific benchmarks using JMH's filtering capabilities:

```bash
# Run only default NanoID benchmark
mvn exec:java -Dexec.args=".*generateDefaultNanoId.*"

# Run only custom length benchmark
mvn exec:java -Dexec.args=".*generateNanoId10.*"

# Run only custom alphabet benchmark
mvn exec:java -Dexec.args=".*generateCustomNanoId.*"
```

## Benchmark Configuration

The benchmarks are configured with the following JMH settings:

- **Warmup**: 2 iterations
- **Measurement**: 5 iterations
- **Fork**: 0 (disabled for classpath compatibility)
- **Time Unit**: Microseconds
- **State**: Benchmark scope

## Understanding the Output

JMH will output performance metrics including:

- **Throughput**: Operations per second (ops/s)
- **Average Time**: Average execution time per operation
- **Error**: Statistical error margin
- **Score**: Benchmark score with confidence intervals

Example output:
```
Benchmark                                  Mode  Cnt    Score   Error  Units
NanoIdBenchmark.generateDefaultNanoId     thrpt    5  123.456 ± 7.890  ops/us
NanoIdBenchmark.generateNanoId10          thrpt    5  234.567 ± 8.901  ops/us
NanoIdBenchmark.generateCustomNanoId      thrpt    5  345.678 ± 9.012  ops/us
```

## Advanced Configuration

### Custom JMH Parameters

You can customize benchmark execution with additional JMH parameters:

```bash
# Run with custom iterations
mvn exec:java -Dexec.args="-wi 5 -i 10"

# Generate detailed reports
mvn exec:java -Dexec.args="-rf json -rff benchmark-results.json"

# Run with profilers
mvn exec:java -Dexec.args="-prof gc"
```

### Available Profilers

- `gc`: Garbage collection profiling
- `stack`: Stack profiling
- `perf`: Performance counter profiling (Linux only)

## Project Structure

```
nanoid-java-benchmark/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── nanoid/
│                   └── NanoIdBenchmark.java
├── pom.xml
├── README.md
├── LICENSE
└── .gitignore
```

## Dependencies

- **nanoid-java**: Core NanoID implementation
- **JMH Core**: Microbenchmark harness
- **JMH Annotation Processor**: JMH code generation

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Related Projects

- [nanoid-java](https://github.com/albahrani/nanoid-java) - Java implementation of NanoID
- [nanoid](https://github.com/ai/nanoid) - Original JavaScript implementation

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
