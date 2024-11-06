# Ice Cream Flavors

A simple Java project demonstrating the use of enums to represent and print different ice cream flavors. This project features a `Flavor` enum with methods to print the names of specific flavors and an option to list all available flavors.

## Features

- **Flavor Enum**: Defines three ice cream flavors: `CHOCOLATE`, `VANILLA`, and `STRAWBERRY`.
- **Methods**:
  - `getChocolate()`: Prints the `CHOCOLATE` flavor.
  - `getVanilla()`: Prints the `VANILLA` flavor.
  - `getStrawberry()`: Prints the `STRAWBERRY` flavor.
  - `listFlavors()`: Lists all available flavors.
  
## Installation

To run this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/ice-cream-flavors-enum-java.git
   ```

2. Navigate into the project directory:
   ```bash
   cd IceCreamFlavors
   ```

3. Compile and run the project:
   ```bash
   javac LetsDoEnums.java
   java LetsDoEnums
   ```

## Usage

Once you run the project, it will display one of the ice cream flavors, depending on which method you call. For example, the following code will print the `VANILLA` flavor:

```java
Flavor.getVanilla();
```

You can also list all available flavors by calling:

```java
Flavor.listFlavors();
```

## Example Output

```text
VANILLA
```

If you call `Flavor.listFlavors()`, the output will be:

```text
CHOCOLATE
VANILLA
STRAWBERRY
```

---
