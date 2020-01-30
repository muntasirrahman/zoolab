
# Java Class Composition and Inheritance
---

# A. Basic
 
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

### 3. Rooster

a. Says  “Cock-a-doodle-doo”
b. Rooster relation to chicken
Rooster is use same class, but different state. At constructor method, the caller passes a parameter to determine 
the state of the chicken instance. If it a rooster, then sound variable will be set to Doodle.

c.  That's the way to model rooster without using inheritance.

### 4. Parrot

a.  A parrot living with dogs says: “Woof, woof”\
b.  A parrot living with cats says: “Meow"\
c.  A parrot living near the rooster says: “Cock-a-doodle-doo”\
d.  The way to keep the parrot maintainable (e.g. another parrot\
    lives near a Duck? a parrot lives near a phone that rings frequently) ?
    The way to do that is by having an interface e.g. SoundEmitter, that is implemented
    by extension of Animals, or things. 
    The SoundEmitter instance then passed to Parrot.
    The sound emitted by it, is copied by the parrot instance as its own.
    
# B. Fish Implementation

### 1. Fish doesn't sing, doesn't walk, but it can swim.

### 2. Shark and Clown Fish

Shark eats other fish.
Clown Fish makes jokes.

### 3. Dolphin Implementation and Reducing Code Duplication

Dolphin implements Swimmer interface.

To reduce code duplication, use DefaultSwimmer class, and make it as 
member variable of Dolphin, Fish, and Duck. 

# D. Animal that change over time (Butterfly)

### D.1. Butterfly can fly, but it doesn't make sound

