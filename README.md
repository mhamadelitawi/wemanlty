# wemanlty

This repository is a refactoring of the [GildedRose Kata](https://github.com/emilybache/GildedRose-Refactoring-Kata) project  .
It has as objective to refactor a bad code into a clean one.

Requirement can be found in `GildedRoseRequirements.txt` file (for other languages kindly refer to the original repository)

### Methodology

The methodology pursuit was like this :
- building a proper unit test that cover all scenarios on the legacy code
- start by cleaning small chunks of codes
- revert some condition to identify the proper parameters
- build everythink with function
- transfer everything into OOP
- Adding the new needed feature

### Testing the solution
The solution was tested on Java 8 with a maven 3.8.2. However to compile and test it only java 8 is needed due maven/graddle wrappers  file.

To install java you can use [oracle installer](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
) that match your environement.

To ensure that java is installed use: `java --version`.

Make sure that `JAVA_HOME` is set as environment variable.

Now to compile and install the project  use:
On Unix/Linux:

`./mvnw clean install` or `./gradlew clean build`

On Windows
`./mvnw.cmd clean install` or `./gradlew.cmd  clean build`




