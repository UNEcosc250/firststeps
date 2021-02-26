/*
 * build.sbt defines a Scala project, telling the Scala Build Tool (sbt) its details
 *
 * It's written in Scala, but there are a few oddities because of how Scala allows you to write a "DSL" (domain
 * specific language). So for instance, if you're wondering what ":=" means, it's really a function defined
 * in SBT's little language (to mean "set this property").
 *
 */
lazy val root = (project in file(".")).
  settings(
    // the name of our project
    name := "firststeps",

    // the version of our project
    version := "2021.0",

    // the version of Scala we want to use to compile our project
    scalaVersion := "3.0.0-RC1"
  )

// This is a dependency defined in the build tool. Dependencies come from artifact repositories on the web - these
// hold compiled JAR files of libraries that the build tool can download for you.
// These are the same repositories that are also used for Java, Clojure, Kotlin, and other JVM languages.
// Maven Central is the most famous repository.
//
// SBT uses a DSL to describe them. Here,
// org.scalameta is the group (a bit like a package name, it means different 'groups' don't have to worry about
//               name-clashes if they publish libraries that happen to have the same name
// munit is the name of the artifact (the mUnit testing library)
// 0.7.20 is the version of the library to fetch
// Test means it's only available in the 'test scope' (i.e. we can only refer to it from tests)
// %% also has a special meaning - it means "get the version for the version of Scala I am using". If you look at
//    what it downloads, it'll be something like org.scalameta.munit_3.0.0-M3.jar
libraryDependencies += "org.scalameta" %% "munit" % "0.7.22" % Test

// We also need to register munit as a test framework in sbt so that "sbt test" will work and the IDE will recognise
// tests
testFrameworks += new TestFramework("munit.Framework")

// That's it for now, though if you look in the project/ directory you'll also see build.properties and plugins.sbt
