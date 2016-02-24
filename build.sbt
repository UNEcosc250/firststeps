lazy val root = (project in file(".")).
  settings(
    name := "firststeps",
    version := "1.0",
    scalaVersion := "2.11.7"
  )

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
