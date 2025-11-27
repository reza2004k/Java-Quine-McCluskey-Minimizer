# 🔢 Java Quine-McCluskey (QM) Logic Minimizer

This project is a console application written in **Java** that solves the problem of Boolean function minimization using the **Quine-McCluskey (Tabulation) Method**. This technique is a systematic, algorithmic alternative to the Karnaugh Map method for simplifying Sum-of-Products (SOP) Boolean expressions, especially for functions with a larger number of variables.
/
## ✨ Features

* **Boolean Function Input:** Accepts input in the form of minterms (decimal indices) for a function up to 4 variables.
* **Minterm Conversion:** Automatically converts the decimal minterms into their equivalent binary representation.
* **Tabular Method Implementation:** Implements the core **Quine-McCluskey algorithm** steps:
    * Grouping minterms based on the number of '1's.
    * Iterative comparison and pairing to form higher-order implicants.
    * Identification of **Prime Implicants** (PIs).
* **Output Simplification:** Displays the resulting minimized Boolean expression.

## 🛠️ Technologies Used

* **Language:** Java
* **Interface:** Console/Terminal (Command Line Interface - CLI)
* **Concepts:** Data Structures (`LinkedList` or `ArrayList` for grouping/storage), Recursion/Iteration, and Bitwise Logic.

## 🚀 Getting Started

To compile and run the QM Minimizer tool on your local machine, follow these steps.

### Prerequisites

* Java Development Kit (JDK) 8 or later.

### Installation and Running

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YOUR_USERNAME/Java-Quine-McCluskey-Minimizer.git](https://github.com/YOUR_USERNAME/Java-Quine-McCluskey-Minimizer.git)
    cd Java-Quine-McCluskey-Minimizer
    ```
2.  **Compile the Java files:**
    ```bash
    javac Main.java
    ```
3.  **Run the application:**
    ```bash
    java Main
    ```

### Usage

The program will run in the console and prompt you for the required input:

1.  **Enter the number of minterms (n):**
    The program first asks how many minterms are in your Boolean function.
    *(e.g., if you have 5 minterms, enter `5`)*

2.  **Enter the minterms (one by one):**
    You will then be prompted to enter the decimal values of the minterms that result in a logical '1'.
    *(e.g., for the function F(A,B,C,D) = Σ(0, 2, 5, 6, 7), you would enter `0`, `2`, `5`, `6`, `7`)*

3.  **View Results:**
    The application will process the input and display the resulting Prime Implicants and the simplified SOP expression in the console.

---
