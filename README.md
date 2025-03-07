# Shape_Operations 


## Description 
This is a Menu-Driven Java Program to calculate the Area, Perimeter, and Volume of different geometric shapes based on user input(like circle, cylinder, square, rectangle, sphere, and equilateral pyramid). The program follows Object-Oriented Programming (OOP) principles by utilizing abstract classes and interfaces.


## Features
- Supports calculations for Circle, Rectangle, Square, Sphere, Cylinder, and Equilateral Pyramid (Square Base).
- Uses an **abstract class **Shape to enforce method implementation for calculateShape() (Area) and calculatePerimeter() (Perimeter).
- Implements an **interface **Volume for 3D shapes requiring volume calculations.
- Menu-driven system for easy user interaction.
- Dynamic input handling to allow users to enter required measurements.


## Classes and Structure
### 1. Shape.java (Abstract Class)
   Methods:
   - setShapeName(String shape): Sets the name of the shape.
   - calculateShape(): Abstract method for calculating area.
   - calculatePerimeter(): Abstract method for calculating perimeter.

### 2. Volume.java (Interface)
  Methods:
  - calculateVolume(): Abstract method for calculating volume of 3D shapes.

### 3. Circle.java
   - Extends: Shape
   - Implements: calculateShape(), calculatePerimeter()
   - Methods:
     - Computes Area = π * r²
     - Computes Perimeter = 2 * π * r

### 4. Rectangle.java
  - Extends: Shape
  - Methods:
     - Computes Area = length * width
     - Computes Perimeter = 2 * (length + width)
   
### 5. Square.java
  - Extends: Shape
  - Methods:
     - Computes Area = side²
     - Computes Perimeter = 4 * side

### 6. Sphere.java
  - Extends: Shape
  - Implements: Volume
  - Methods:
     - Computes Surface Area = 4 * π * r²
     - Computes Volume = (4/3) * π * r³
     - Perimeter is not applicable (returns 0)
   
### 7.Cylinder.java
  - Extends: Shape
  - Implements: Volume
  - Methods:
     - Computes Surface Area = 2 * π * r * (r + h)
     - Computes Perimeter = 2 * π * r
     - Computes Volume = π * r² * h

### 8. EquilateralPyramid.java
  - Extends: Shape
  - Implements: Volume
  - Methods:
    - Computes Surface Area = base² + 2 * base * sqrt((base²/4) + height²)
    - Computes Perimeter = 4 * base
    - Computes Volume = (1/3) * base² * height

### 9. Main.java
  - Handles user input and provides menu options for selecting and calculating shape properties.
  - Method: displayResults(Shape shape): Displays the calculated area, perimeter, and volume (if applicable).


## How to Run the Program
### 1: Clone the Repository
  - git clone https://github.com/vedants27/Shape_Operations.git
  - cd Shape_Operations
### 2: Compile the Java Files
  javac Main.java
### 3: Run the Program
  java Main


## Code Structure
Shape_Calculator/
- Main.java
- Shape.java
- Volume.java
- Circle.java
- Rectangle.java
- Square.java
- Sphere.java
- Cylinder.java
- EquilateralPyramid.java
- README.md


## Example Usage

![image](https://github.com/user-attachments/assets/cdf03a03-7a18-499a-815e-55814a3e2d24)





        







