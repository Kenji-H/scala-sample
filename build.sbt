name := "scala-sample"

organization := "com.kenjih"

version := "0.0.1"

scalaVersion := "2.11.5"

resolvers += "CodeLibs Repository" at "http://maven.codelibs.org/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc(),
  "org.codelibs" % "lucene-analyzers-kuromoji-ipadic-neologd" % "6.0.0-20160519"
)

initialCommands := "import com.kenjih.scalasample._"

