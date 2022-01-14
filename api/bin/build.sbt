lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(scala-web-api-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Mongo API Project",

scalaVersion := "2.13.1",

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.4.1",
    "org.springframework.boot" % "spring-boot-starter-data-mongodb" % "2.4.1"
   ),

  mainClass := Some("example.Main")
)
