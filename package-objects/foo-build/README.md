The purpose of this project was 

1. to write an sbt project from a tutorial project
2. to learn how package objects work
- we define everything in the `example` package
- there is like... a subpackage??? called `core`
- we have `PrintPlanted.scala` that runs some code
  - it uses package val `planted` defined in `package.scala`
  - it uses package function `showFruit` also defined in `package.scala`
- `package.scala` is a file that makes everything in it available to any file in the same package, as long as we import `example.core.whateverwewanted`

## Run This
`sbt run` will run the project
- it won't know to run `Hello.scala` or `PrintPlanted.scala`, so it'll ask you to choose



