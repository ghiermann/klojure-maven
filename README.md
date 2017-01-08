# klojure-maven
Example maven-project for calling clojure from kotlin

### IntelliJ
Create run configuration for Main class -> replace 'Build' activity in the 'Before launch' section with maven goals (e.g., 'clean compile').
This way the class files are built with maven and available when IntelliJ launches the main class.  

Suggested plugins: _Cursive_ (clojure), _Kotlin_
