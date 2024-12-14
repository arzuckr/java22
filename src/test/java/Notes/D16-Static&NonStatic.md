# Static
- `static` keyword, makes methods/objects belong to a class.
## Static Variable
* A static variable belongs to the class, not to any specific object.
* It is shared among all instances(objects) of the class
* **Key Points**
    * Declared using the `static` keyword.
    * Memory is allocated once the class is loaded.
    * Can be accessed using the **class name**.(e.g., `ClassName.variableName`).
    * Useful for constants or data shared across all objects.
## Non-Static Variable
* A non-static variable belongs to a specified object.
* Each object has its own copy of the variable.
* **Key Points**
    * Declared without the `static` keyword
    * Memory is allocated once the object is created.
    * **Can ONLY** be accessed using an object of the class.(e.g., `objectName.variableName`)
    * Useful for storing data unique to each object. 
    * 
## Static Method vs. NonStatic Method

* Usually used for creating a common logic that will effect all object.
* If you want to be able to use a method without creating an object then you can make it static.
* In static method you can not call non-static variable/instance variables.

 ## Non-Static Method  

* Used for logic that will effect each object will different
* It could access both 'static' 'non-static' variables.
* To call this method we must create an  object.