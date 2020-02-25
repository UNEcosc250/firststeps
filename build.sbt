lazy val root = (project in file(".")).
  settings(
    name := "firststeps",
    version := "1.0",
    scalaVersion := "2.13.1"
  )

libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test"
