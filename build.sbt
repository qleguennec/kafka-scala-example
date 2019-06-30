name := "kafka-scala-example"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies += "org.apache.kafka" %% "kafka" % "2.1.0"

mainClass in (Compile, run) := Some("Main")