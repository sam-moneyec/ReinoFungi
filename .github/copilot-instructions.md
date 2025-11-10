# Poliretos - AI Agent Instructions

## Project Overview
This is a Java project demonstrating various numeric and character series implementations. The project showcases different approaches to generate mathematical sequences and character patterns using three different loop structures: for, while, and do-while.

### Core Components
- `seriesnumericas`: Contains classes for numeric series generation (S1-S12)
- `seriescaracteres`: Contains classes for character pattern generation (S1-S9)
- `Main.java`: Entry point that demonstrates all series implementations

## Key Architecture Patterns

### Series Implementation Pattern
Each series follows a consistent implementation pattern:
```java
public class SXNumerica/SXCaracteres {
    public void mostrarSeries(int n) {
        // Display header
        // Call implementations for each loop type
    }

    public void g4_SX_for(int n) { /* FOR implementation */ }
    public void g4_SX_while(int n) { /* WHILE implementation */ }
    public void g4_SX_doWhile(int n) { /* DO-WHILE implementation */ }
}
```

### Notable Patterns
1. **Fibonacci Series**: See `S1Numerica.java` for standard implementation
2. **Prime Numbers**: See `S5Numerica.java` for efficient prime number generation
3. **Character Repetition**: See `S7Caracteres.java`, `S8Caracteres.java` for progressive character repetition patterns
4. **Modular Cycling**: Use of `% operator` for cyclic patterns in `S6Caracteres.java`

## Development Workflows

### Building and Running
- Source files are in `src/` directory
- Compiled files go to `bin/` directory
- Dependencies (if any) go in `lib/` directory

### Project Structure
```
src/
├── Main.java
├── seriesnumericas/    # Numeric series implementations
└── seriescaracteres/   # Character series implementations
```

### Key Files
- `Main.java`: Central execution point demonstrating all series
- `S5Numerica.java`: Example of helper methods (`esPrimo()`)
- `S3Numerica.java`: Example of fraction series implementation

## Project-Specific Conventions

### Naming Conventions
1. Class names: `SXNumerica` or `SXCaracteres` where X is the series number
2. Method names: 
   - `mostrarSeries(int n)`: Main display method
   - `g4_SX_[loopType](int n)`: Implementation methods where:
     - g4: Group identifier
     - SX: Series number
     - loopType: for/while/doWhile

### Error Handling
- Each do-while implementation includes basic input validation:
```java
if (n <= 0) return;
```

### Pattern Implementation Tips
1. For cyclic character patterns:
```java
char letra = (char)('a' + (i % 26));  // Cycles through alphabet
```

2. For Fibonacci-based series:
```java
int c = a + b;
a = b;
b = c;
```

3. For fraction series:
```java
System.out.print(numerator + "/" + denominator + " ");
```

## Integration Points
- All series classes are instantiated and called from `Main.java`
- User input is handled through `Scanner` in `Main.java`
- Output is consistently formatted with headers and newlines for readability