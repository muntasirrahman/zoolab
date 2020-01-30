
# Java Class Composition and Inheritance
---

![Class Diagram](Animal.png)

#A. Basic

### 1. Method `sing()` Implementation of class Bird

#### a. How to unit test it?

* Change return value of method `sing()` from void to String.
* Use this string as parameter for method `assertEquals`
* See class `BirdTest` and `AnimalTest`
* Using JUnit 5
 
#### b. How to optimise the code for maintainability?

* By writing comment\
    e.g. enum `Action` has documentation as comment.
* By Separating concern by separating classes into different packages.
* By coupling architecture component separately, using various design patterns, e.g. Strategy design pattern. 

### A.2. Duck and Chicken

Chicken inability to fly is implemented by throwing `ActionException` inside method `fly()`.
```$java
public Action fly() throws ActionException {
    
    throw new ActionExection(Action.FLY, "My wings are clipped");
}
```
See class `Duck`, and class `Chicken`.

### A.3. Rooster

Initially Rooster is implemented as Chicken instance who has different states.
 
At constructor method, the caller passes a boolean parameter to determine the new `Chicken` instance as rooster or as hen. 

Based on parameter value, the member variable sound is adjusted accordingly.


### A.4. Parrot

* class Parrot has method `liveNearby` that accept `SoundEmitter` instance as parameter
* interface `SoundEmitter` define method `sing()` that return String.
* class Parrot use that value as its own sound for method `sing()`
* Any other object that implements interface `SoundEmitter` can be used as basis of class Parrot `sing()` 
* See class `ParrotTest` as illustration of above explanation.
    
# B. Fish Implementation

### B.1. Can't sing, Can't walk, but It Can Swim.

* Initially those are implemented as ActionException
* Later, after refactoring, method sing() and method walk() are removed from class Fish
* The walking and singing capability are determined by implementation of interface Walker and interface SoundEmitter. 

### B.2. Shark and ClownFish

* See class `Shark` and class`ClownFish`


### B.3. Dolphin

* class `Dolphin` implements interface `Swimmer` without extending class `Fish`
* To minimize code duplication, the actual method `swim()` is implemented by class `DefaultSwimmer`.
* class `DefaultSwimmer` is instantiated inside method constructor of class Dolphin, Fish, Duck, Shark, ClownFish. 

# D. Animal that change over time (Butterfly)

### D.1. Butterfly can fly, but it doesn't make sound

### D.2. Caterpillar metamorphose to Butterfly

* The caterpillar mode is modeled as group state of member variable of class Butterfly.
* The detail of method `fly()` is delegated class DefaultFlyer.
* An instance of class DefaultFlyer is created, after method `metamorphose()` is invoked.  
* See class `Butterfly` and class `ButterflyTest` as illustration.

# E. Animal Capability Counter

|*Capability*|*Count*|*Animals*|
|------------|------:|---------|
| Fly  |4 | Bird, Duck, Parrot, Butterfly |
| Walk |9 | Bird, Duck, Chicken, Rooster, Parrot, Frog, Dog, Butterfly, Cat|
| Sing |9 | Bird, Duck, Chicken, Rooster, Parrot, Dolphin, Frog, Dog, Cat |
| Swim |5 | Duck, Fish, Shark, ClownFish, Dolphin|

