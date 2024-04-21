# Braille and ASCII Converter

## Overview

This project provides tools for converting between Braille characters and ASCII text. The project consists of multiple Java classes each handling different aspects of the conversion process, along with utility classes for managing binary trees and handling exceptions.

## Authors

- Garikai Gijima | Samuel Rebelsky

## Acknowledgments

- Sam Rebelsky gave instructions and starter code
- StackOverflow helped with various programming challenges

## Project Components

### `BrailleASCII.java`
- **Purpose**: This is the main executable class for the project. It handles user input, performs conversions between Braille and ASCII, and manages output based on command-line arguments.

### `BitTree.java`
- **Purpose**: Manages a binary tree data structure to efficiently store and retrieve mappings from Braille to ASCII characters and vice versa. It supports dynamic tree construction based on input and provides methods for setting and getting values from bit patterns.

### `BitTreeNode.java`
- **Purpose**: Represents a node in the binary tree used in the `BitTree` class. Each node can hold a value and links to its left and right child nodes, facilitating the binary tree structure.

### `BrailleASCIITables.java`
- **Purpose**: This class encapsulates the mapping data between ASCII characters and Braille patterns. It uses `BitTree` instances to store the mappings and provides static methods to convert characters to Braille and back.

### `InvalidBitsException.java`
- **Purpose**: Custom exception class used by `BitTree` and other classes to handle situations where an invalid bit pattern is encountered during operations.

### Data Tables
- **`ASCIIToBrailleTable.txt`**: Contains mappings from ASCII characters to corresponding Braille bit patterns.
- **`BrailleToAsciiTable.txt`**: Contains mappings from Braille bit patterns to corresponding ASCII characters.
- **`BrailleToUnicodeTable.txt`**: Contains mappings from Braille bit patterns to corresponding hex values of Unicode characters, supporting direct output of Braille symbols.

## Usage

The project is intended to be run from the command line. Here are some example commands

### Convert ASCII to Braille
```bash
$ java BrailleASCII braille "Hello World"
110010100010111000111000101010000000010111101010111010111000100110
```
This will output the Braille encoding for the input string "Hello World".

### Convert Braille to ASCII
```bash
$ java BrailleASCII ascii "110010100010111000111000101010000000010111101010111010111000100110"
HELLO WORLD
```
This command will decode the given Braille bit patterns into the ASCII string.

### Convert ASCII to Unicode Braille
```bash
$ java BrailleASCII unicode "Hello World"
⠓⠑⠇⠇⠕⠀⠺⠕⠗⠇⠙
```
This will convert the ASCII string "Hello" to Unicode Braille symbols, which can be displayed in environments that support Unicode.

## Additional Notes

Ensure your development environment supports UTF-8 encoding to handle Unicode output correctly, especially for displaying Braille characters.

