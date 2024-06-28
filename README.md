# Searching Algorithms in Java

Welcome to the Searching Algorithms repository! This repository contains Java implementations of various searching algorithms, along with explanations and example usage. The goal is to provide clear and efficient implementations of common searching algorithms that can be easily integrated into your projects or used for educational purposes.

## Table of Contents

- [Introduction](#introduction)
- [Algorithms Implemented](#algorithms-implemented)
- [Getting Started](#getting-started)
- [Usage](#usage)

## Introduction

Searching algorithms are fundamental in computer science, used to retrieve information stored within data structures. This repository covers a range of searching techniques, from simple linear search to more complex algorithms like binary search.

## Algorithms Implemented

1. [Linear Search](#linear-search)
2. [Binary Search](#binary-search)
3. [Jump Search](#jump-search)
4. [Interpolation Search](#interpolation-search)
5. [Exponential Search](#exponential-search)
6. [Fibonacci Search](#fibonacci-search)
7. [Ternary Search](#ternary-search)

### Linear Search

- **Description**: A simple search algorithm that checks every element in the list until the desired element is found.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Code**: [LinearSearch.java](src/com/algorithms/search/LinearSearch.java)

### Binary Search

- **Description**: An efficient search algorithm that works on sorted arrays by repeatedly dividing the search interval in half.
- **Time Complexity**: O(log n)
- **Space Complexity**: O(1)
- **Code**: [BinarySearch.java](src/com/algorithms/search/BinarySearch.java)

### Jump Search

- **Description**: A search algorithm for sorted arrays that works by jumping ahead by fixed steps and then performing a linear search within the block.
- **Time Complexity**: O(√n)
- **Space Complexity**: O(1)
- **Code**: [JumpSearch.java](src/com/algorithms/search/JumpSearch.java)

### Interpolation Search

- **Description**: An improved variant of binary search for uniformly distributed data, estimating the position of the target value.
- **Time Complexity**: O(log log n) in the best case
- **Space Complexity**: O(1)
- **Code**: [InterpolationSearch.java](src/com/algorithms/search/InterpolationSearch.java)

### Exponential Search

- **Description**: An algorithm that first finds the range where the element is present and then performs binary search within that range.
- **Time Complexity**: O(log n)
- **Space Complexity**: O(1)
- **Code**: [ExponentialSearch.java](src/com/algorithms/search/ExponentialSearch.java)

### Fibonacci Search

- **Description**: A search algorithm based on dividing the array in a way similar to Fibonacci series.
- **Time Complexity**: O(log n)
- **Space Complexity**: O(1)
- **Code**: [FibonacciSearch.java](src/com/algorithms/search/FibonacciSearch.java)

### Ternary Search

- **Description**: Similar to binary search, but divides the array into three parts instead of two.
- **Time Complexity**: O(log3 n)
- **Space Complexity**: O(1)
- **Code**: [TernarySearch.java](src/com/algorithms/search/TernarySearch.java)

### Getting Started

To get started, clone the repository:

```bash
git clone https://github.com/aishwarya-wagh/Searching_Algorithms.git
cd Searching_Algorithms
```

### Usage

Each algorithm is implemented in its respective Java file under the src/com/algorithms/search directory. To use an algorithm, you can directly import the class into your project.
