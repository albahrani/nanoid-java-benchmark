# Contributing to NanoID Java Benchmark

Thank you for your interest in contributing to the NanoID Java Benchmark project! This document provides guidelines and information for contributors.

## Code of Conduct

By participating in this project, you agree to abide by our code of conduct. Please be respectful and professional in all interactions.

## Getting Started

### Prerequisites

- JDK 17 or higher
- Apache Maven 3.6.0 or higher
- Git

### Setting up your development environment

1. Fork the repository on GitHub
2. Clone your fork locally:
   ```bash
   git clone https://github.com/YOUR_USERNAME/nanoid-java-benchmark.git
   cd nanoid-java-benchmark
   ```
3. Add the upstream repository:
   ```bash
   git remote add upstream https://github.com/albahrani/nanoid-java-benchmark.git
   ```
4. Build the project:
   ```bash
   mvn clean compile
   ```

## Making Changes

### Before you start

- Check the issue tracker to see if your feature/bug is already being worked on
- For large changes, consider opening an issue first to discuss the approach

### Development workflow

1. Create a new branch for your feature/fix:
   ```bash
   git checkout -b feature/your-feature-name
   ```

2. Make your changes following the coding standards below

3. Test your changes:
   ```bash
   mvn clean compile
   mvn exec:java -Dexec.args="-f 1 -wi 1 -i 1"
   ```

4. Commit your changes with a clear commit message:
   ```bash
   git commit -m "Add feature: description of your changes"
   ```

5. Push to your fork:
   ```bash
   git push origin feature/your-feature-name
   ```

6. Create a Pull Request on GitHub

## Coding Standards

### Java Code Style

- Follow standard Java naming conventions
- Use meaningful variable and method names
- Add JavaDoc comments for public methods and classes
- Keep methods focused and small
- Use proper indentation (4 spaces)

### JMH Benchmark Guidelines

- Use appropriate JMH annotations
- Set reasonable warmup and measurement iterations
- Use `@State(Scope.Benchmark)` for shared state
- Include meaningful benchmark names that describe what's being tested
- Add comments explaining complex benchmark setups

### Example benchmark method:

```java
/**
 * Benchmark for generating NanoIDs with custom alphabet.
 * Tests performance with a reduced character set.
 */
@Benchmark
public String generateCustomAlphabetNanoId() {
    return NanoId.customNanoid("0123456789abcdef", 16);
}
```

## Types of Contributions

### Adding New Benchmarks

When adding new benchmark scenarios:

1. Ensure the benchmark tests a meaningful use case
2. Use appropriate JMH configuration
3. Update the README.md to document the new benchmark
4. Include the benchmark in the summary table

### Improving Documentation

- Fix typos and grammar issues
- Add examples and clarifications
- Update outdated information
- Translate documentation (if applicable)

### Bug Fixes

- Include a clear description of the bug
- Add test cases that reproduce the issue
- Ensure the fix doesn't break existing functionality

### Performance Improvements

- Provide benchmark results showing the improvement
- Explain the optimization approach
- Ensure the changes don't affect benchmark accuracy

## Testing

### Running Tests

```bash
# Compile the project
mvn clean compile

# Run a quick benchmark test
mvn exec:java -Dexec.args="-f 1 -wi 1 -i 1"

# Run full benchmarks (takes longer)
mvn exec:java
```

### Benchmark Results

- Include benchmark results in your PR description for performance-related changes
- Use consistent testing environments when comparing results
- Run benchmarks multiple times to ensure consistency

## Pull Request Process

1. **Update documentation**: Ensure any changes are reflected in the README.md and other relevant documentation

2. **Add/update tests**: Include appropriate benchmark tests for new features

3. **Clean commit history**: Squash commits if necessary to maintain a clean history

4. **Fill out PR template**: Provide a clear description of your changes

5. **Respond to feedback**: Address any review comments promptly

## Issue Reporting

When reporting issues:

- Use a clear and descriptive title
- Provide steps to reproduce the issue
- Include system information (OS, Java version, Maven version)
- Include relevant benchmark output or error messages

## Questions and Support

- Open an issue for questions about the project
- Check existing issues and discussions before asking
- Be specific about what you're trying to achieve

## Recognition

Contributors will be acknowledged in the project. Significant contributions may result in collaborator access.

Thank you for contributing to NanoID Java Benchmark!
