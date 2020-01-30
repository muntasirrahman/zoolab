
# Java Class Composition and Inheritance

---

## 1. Implementation of Sing method for the Bird

    * a. How to unit test it? 
    * b. How to optimise the code for maintainability?

#### 1.a. Unit Test Implementation

By modifying Bird's methods to return a value of enum Action:
```$Java
Action fly()
Action sing()
```

The enum `Action` has following values:
* WALK
* FLY
* SING

At BirdTest and AnimalTest classes, then ensure `assertEquals` to expected return value of each method.

#### 1.b. Code Optimisation for Maintainability

* By writing comment  \
    e.g. The enum Action has documentation as comment.
* By Separating concern by separating classes into module packages
* By coupling architecture component separately

### 2. Special Sound of Duck and Chicken

a. A duck says: "Quack, quack".\
b. A duck can swim.\
c. A chicken says: "Cluck, cluck".\
d. A chicken can't fly.

