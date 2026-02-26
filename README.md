# Sprint 1 Task S1.08

## Repository with level-1 and level-2 exercises from the Java programming course, developed using IntelliJ IDEA and Maven.

### 📂 Repository Contents

| Level   | Exercise | Package                                    | Principal Classes            | Description                                                                                                                                                     |
|---------|----------|--------------------------------------------|------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Level 1 | 1        | `level1.lambdasnstreams.exercise1`         | `LambdasNStreamsMain`        | Create method to return a List Strings contains 'o'.                                                                                                            |
| Level 1 | 2        | `level1.lambdasnstreams.exercise2`         | `LambdasNStreamsMain`        | Reuse the previous exercise to filter Strings contains 'o' and have 5 letters.                                                                                  |
| Level 1 | 3        | `level1.lambdasnstreams.exercise3`         | `MonthsMain`                 | Create a List with names of months, show with lamda.                                                                                                            |
| Level 1 | 4        | `level1.lambdasnstreams.exercise4`         | `MonthsMain`                 | Reuse the previous exercise but with reference method.                                                                                                          |
| Level 1 | 5        | `level1.lambdasnstreams.exercise5`         | `FunctionalMain`, `PiValue`  | Create a Functional Interface `getPiValue` and assignate Pi number --> `3.1415`.                                                                                |  
| Level 1 | 6        | `level1.lambdasnstreams.exercise6`         | `NamesStringMain`            | Create a String names and sort by minus to most length.                                                                                                         |
| Level 1 | 7        | `level1.lambdasnstreams.exercise7`         | `NamesStringMain`            | Reuse the previous exercise to sort reverse.                                                                                                                    |
| Level 1 | 8        | `level1.lambdasnstreams.exercise8`         | `Reverse`, `ReverseMain`     | Create a Functional Interface reverse to reverse a String.                                                                                                      |
| Level 2 | 1        | `level2.maipulatefunctionaldata.exercise1` | `PropertyNamesMain`          | Create a String List of property names, create a method to return String Start with 'A'.                                                                        |
| Level 2 | 2        | `level2.maipulatefunctionaldata.exercise2` | `ListToStringMain`           | Create an Integer List to print sepparately by ',' but not the last.                                                                                            |
| Level 2 | 3        | `level2.maipulatefunctionaldata.exercise3` | `Operation`, `OperationMain` | Create a Functional Interface with `operation` method to return float number do some differents operations: `sum`, `subtract`, `multiplication` and `dividion`. |                                                            
| Level 2 | 4        | `level2.maipulatefunctionaldata.exercise4` | `NamesStringMain`            | Create a List to sort by different types.                                                                                                                       |
| Level 3 | 1        | `level3.objectstream.exercise1`            | `Student`, `StudentMain`     | Create a Student Class and filter by different type of Stream and object methods.                                                                               |

## ⚙️ Requirements

- Java JDK 11 o superior
- Maven
- IntelliJ IDEA (optional, but recommended)

---

## 💻 Installation and Execution

1. Clone the repository:

````bash
git clone https://github.com/erictc95/TascaS1.08.git
````

2. Open the project in IntelliJ IDEA or compile with Maven:

````bash
cd TascaS1.08
mvn compile
````

3. Run a specific exercise with Maven:

````bash
mvn exec:java -Dexec.mainClass="package.Main"
````

4. Replace package.Main with the main class of each exercise:

Level-1 / Exercise 1: level1.lambdasnstreams

Level-1 / Exercise 1: level2.lambdasnstreams

Level-1 / Exercise 1: level3.lambdasnstreams

Level-1 / Exercise 1: level1.lambdasnstreams

Level-1 / Exercise 1: level2.lambdasnstreams

Level-1 / Exercise 1: level3.lambdasnstreams

Level-1 / Exercise 1: level1.lambdasnstreams

Level-1 / Exercise 1: level2.lambdasnstreams

Level-2 / Exercise 1: level3.manipulafunctionaldata

Level-2 / Exercise 1: level1.manipulafunctionaldata

Level-2 / Exercise 1: level2.manipulafunctionaldata

Level-2 / Exercise 1: level3.manipulafunctionaldata

Level-3 / Exercise 1: level3.objectstream



You can also open each Main.java class in IntelliJ and run it directly from the IDE.

## 📝 Usage

Each level folder contains independent exercises.
The exercises demostrate Java concepts such as different uses of `Lambdas` and `Streams`, `Manipulate Functional data`, 
`Stream with objects`.


## 🤝 Contributions

If you want to improve the exercises or add examples:

Fork the repository

Create a branch for your changes: git checkout -b my-branch

Commit your changes: git commit -m "My contribution"

Push your branch: git push origin my-branch

Open a Pull Request

## 📜 License

MIT License

## 👤 Author

Eric Tarres Cabrisas - GitHub --> erictc95