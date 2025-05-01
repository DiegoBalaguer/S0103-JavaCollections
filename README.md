# 🎯 Sprint 01.03 – Java Collections

---

## 📋 Description

- Use **Eclipse** or **IntelliJ** for all exercises.
- Follow the **best practices** document from **Sprint 0** to meet delivery requirements on GitHub repositories.
- You may create **Maven**, **Gradle**, or plain **Java** projects.
- ✍️ **Code in English**

---

## 🎯 Objectives

- Get familiar with **Java Collections** to use them effectively in future implementations.
- Understand **Lists**, **Sets**, **Maps**, and **Iterators**.

---

## 📚 Exercise Overview

---

## 🧩 Level 1

### ✅ Exercise 1

Create a class named `Month` with one attribute:
- `name` – stores the name of the month.

---

🔹 Add 11 `Month` objects (with different names) to an `ArrayList`, **excluding "August"**.  
🔹 Insert the `"August"` object in the correct position to ensure the list is in the correct order.

---

🔁 Convert the `ArrayList` to a `HashSet` and verify it does **not allow duplicates**.

---

🔍 Traverse the list using:
- a **for loop**
- an **iterator**

---

### ✅ Exercise 2

1. Create and fill a `List<Integer>`.
2. Create a second `List<Integer>` and insert the elements of the first list in **reverse order**.

> 💡 Use `ListIterator` to read from the first list and insert into the second.

---

### ✅ Exercise 3

The file `countries.txt` contains countries and their capitals.  
Create a program that reads the file and stores the data in a `HashMap<String, String>`.

---

👤 The program will:  
- Ask for the user's name.  
- Randomly display a **country** from the map.  
- Prompt the user to **type the capital** of the displayed country.  
- Award **1 point** for each correct answer.

---

🔁 Repeat this process **10 times**.  
📝 At the end, save the user's name and score in a file named `ranking.txt`.

---

## 🧩 Level 2

### ✅ Exercise 1

Create a class `Restaurant` with:
- `name` (String)
- `score` (int)

---

🔐 Ensure that a `HashSet` **does not allow duplicate restaurants** with the **same name and same score**.

> ☑️ Restaurants with the same name but **different scores** are allowed.  
> ❌ Same name and **same score** → not allowed.

---

### ✅ Exercise 2

Sort the `Restaurant` objects:
- First by **name**
- Then by **score** in **descending order**

---

📌 Example:

name: restaurant1, score: 8
name: restaurant1, score: 7


---

## 🧩 Level 3

### ✅ Exercise 1

📄 Read a CSV file containing:
- `first name`
- `last name`
- `ID`

---

Create a `Person` class with:
- `firstName`
- `lastName`
- `ID`

---

📑 Your program must display a menu:

1.- Add person
2.- Show people sorted by name (A-Z)
3.- Show people sorted by name (Z-A)
4.- Show people sorted by last name (A-Z)
5.- Show people sorted by last name (Z-A)
6.- Show people sorted by ID (1-9)
7.- Show people sorted by ID (9-1)
0.- Exit


---

📋 Display output in the following format:

First Name Last Name ID
Andreu Ballestero Llenas 34835767J
Miquel Bayona Font 48743957B
Guillem Capdevila Riu 33957834J
Albert Carbonell Ferrer 77364986R
Ferran Casas Coderch 23047848P
Maria Casellas Fuste 47102244S
Genis Ciutat Vendrell 39718459N


---

## 💻 Technologies Used

- Java **JDK 21** (Oracle)
- IntelliJ IDEA or Eclipse
- Git & GitHub
- (Optional) Maven or Gradle for build automation

---

## 📋 Requirements

- Java Development Kit (**JDK 21**)
- Git (to clone the repository)
- A compatible IDE such as **IntelliJ IDEA** or **Eclipse**

---

## 🛠️ Installation

1. **Clone the repository**  
   ```bash
   git clone https://github.com/DiegoBalaguer/S0103-JavaCollections.git
   ```

2. **Open in your IDE**
    Import the cloned project in your IDE. Use the appropriate type (Maven/Gradle/Java).

3. **Set up JDK**
    Ensure the JDK version is set to 21 and properly configured.

---

## ▶️ Execution


To run the project:

    Locate the class with the main() method.

    Right-click and run it, or use terminal:
```bash
    java Main
	```

💡 Make sure main() is correctly set as the entry point, especially when using build tools.

---

## 🌐 Deployment

This is an educational project, not meant for production.

To package as a .jar:

```bash
javac Main.java  
jar cfe CollectionsExercises.jar Main *.class  
java -jar CollectionsExercises.jar
```

---

## 📦 Repository

You can find the source code on GitHub:
🔗 https://github.com/DiegoBalaguer/S0103-JavaCollections.git

---

## ✅ Author Notes

These exercises will help you understand and practice working with Java Collections.
Fork it, test it, and extend it as much as you want!

Happy coding! 🚀

"# S0103-JavaCollections" 
