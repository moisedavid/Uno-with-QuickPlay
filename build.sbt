lazy val root = (project in file("."))
  .settings(
    name := "Uno (with QuickPlay)",
    scalaVersion := "2.11.8",
    version := "0.0.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )