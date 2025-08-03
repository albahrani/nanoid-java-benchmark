# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Enhanced benchmark suite with additional test scenarios
- GitHub Actions CI/CD pipeline
- Comprehensive documentation and contribution guidelines
- Issue templates for bug reports, feature requests, and questions
- Pull request template for structured contributions
- Maven Shade plugin for creating executable JARs
- Source and JavaDoc generation plugins

### Changed
- Improved POM.xml with proper metadata and GitHub integration
- Enhanced JMH configuration with better performance settings
- Updated README with comprehensive documentation and examples
- Refined benchmark methodology and reporting

### Fixed
- JMH fork configuration for better classpath handling
- Dependency scope for JMH annotation processor

## [1.0.0] - 2025-01-XX

### Added
- Initial release of nanoid-java-benchmark
- Basic JMH benchmark suite for nanoid-java
- Maven build configuration
- README with basic usage instructions
- MIT license

### Benchmarks Included
- Default NanoID generation (21 characters)
- Custom length NanoID generation (10 characters)
- Custom alphabet NanoID generation (6-character alphabet)
- Short NanoID generation (5 characters)
- Long NanoID generation (50 characters)
- Hexadecimal alphabet NanoID generation (16 characters)
