name := "basic_programming"

organization := "org.assaulter"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.13" % "test",
  "com.google.code.gson" % "gson" % "2.2.4"
)

resolvers +="gson" at "http://google-gson.googlecode.com/svn/mavenrepo/"

initialCommands := "import org.assaulter.basic_programming._"
