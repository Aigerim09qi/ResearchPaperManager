# Research Paper Manager
## Student
Aigerim Dzhunusheva COMFCI-24
## University
Ala-Too International University

---

## Project Description

Research Paper Manager is a console-based Java application designed to organize research papers.
The system allows users to create, view, update, and delete research papers, including journal articles and conference papers.
The application uses Object-Oriented Programming (OOP) principles and supports file-based data persistence.

---

## Objectives

* Implement CRUD operations for managing research papers
* Apply OOP principles: encapsulation, inheritance, and polymorphism
* Store data in files to ensure persistence between sessions
* Create a user-friendly command-line interface
* Handle user input errors and invalid data

---

## Project Requirements

1. Create, Read, Update, Delete (CRUD) operations
2. Command Line Interface (CLI)
3. Input validation (e.g., numeric input, non-negative ID)
4. Data persistence using file storage
5. Modular design (model, service, utils, ui packages)
6. Documentation (this README file)
7. Error handling using try-catch
8. Encapsulation (private fields, getters/setters)
9. Inheritance (ResearchPaper → JournalArticle, ConferencePaper)
10. Polymorphism (method overriding getType())

---

## Project Structure

```
project/
│
├── model/
│   ├── ResearchPaper.java
│   ├── JournalArticle.java
│   └── ConferencePaper.java
│
├── service/
│   └── PaperService.java
│
├── utils/
│   └── FileManager.java
│
├── ui/
│   └── Main.java
```
## Implementation Details

### Data Structures
- ArrayList is used to store research papers dynamically.

### Algorithms
- CRUD operations are implemented using loops and conditions.
- Search by ID is done using iteration.

### Modules
- model: data classes
- service: business logic
- utils: file handling
- ui: user interaction

### Challenges
- Working with file serialization
- Handling invalid user input
- Maintaining clean structure
---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* File I/O (Object Streams)

---

## OOP Concepts Used

### Encapsulation

* Private fields in `ResearchPaper`
* Access via getters and setters

### Inheritance

* `JournalArticle` and `ConferencePaper` extend `ResearchPaper`

### Polymorphism

* `getType()` method overridden in subclasses

---

## Data Persistence

* Data is stored in a file: `papers.dat`
* Uses `ObjectOutputStream` and `ObjectInputStream`
* Automatically loads data on program start

---

## How to Run

1. Open project in IDE (IntelliJ IDEA recommended)
2. Run `Main.java`
3. Use menu to interact with the system

---

## Test Cases

### Create Paper

**Input:**

```
1
ID: 1
Title: AI Research
Author: John
Year: 2024
Type: 1
```

**Output:**

```
Saved!
```

---

### Read Papers

**Output:**

```
1 | AI Research | John | 2024 | Journal Article
```

---

### Update Paper

**Input:**

```
4
Enter ID: 1
New title: Advanced AI
```
**Output:**

```
Saved!
```

---

### Delete Paper

**Input:**

```
3
Enter ID: 1
```
**Output:**

```
Saved!
```

---
### Exit

**Input:**

```
5
```

**Output:**

```
Saving data and exiting... Goodbye!
```

---
### Export to CSV

**Input:**

```
6
```
**Output:**

```
Exported to CSV!
```

---

## Error Handling

* Prevents text input instead of numbers
* Handles missing file errors
* Prevents negative IDs

---

## Screenshots

(Add screenshots here with date and time visible)
<img width="1366" height="768" alt="Снимок экрана (90)" src="https://github.com/user-attachments/assets/8d76d26f-1437-4bd9-805f-105d7b57d09c" />
<img width="1366" height="768" alt="Снимок экрана (93)" src="https://github.com/user-attachments/assets/63653101-4ddc-40cd-aed8-0272ce953d31" />
<img width="1366" height="768" alt="Снимок экрана (88)" src="https://github.com/user-attachments/assets/2daa8ab6-0039-490b-b447-c1ddf9f7db3f" />
<img width="1366" height="768" alt="Снимок экрана (94)" src="https://github.com/user-attachments/assets/c0e52226-7d15-4476-b3ae-f4033696850f" />
<img width="1366" height="768" alt="Снимок экрана (91)" src="https://github.com/user-attachments/assets/d4bdf2eb-4781-4d05-9b82-02defe89e749" />
<img width="1366" height="768" alt="Снимок экрана (102)" src="https://github.com/user-attachments/assets/f2c32623-6b22-49fa-bea8-ed702eeb2ef7" />


---

## Presentation

(Add link to your presentation here)
https://canva.link/it3qtucpo14i1nt
---

## Repository

(Add GitHub repository link here)
https://github.com/Aigerim09qi/ResearchPaperManager.git
---
