//import AssemblyKeys._

//assemblySettings

name := "sparkStudy"

version := "1.0"

scalaVersion := "2.11.11"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core_2.10
libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.2.0",
  "org.apache.spark" % "spark-streaming_2.11" % "2.2.0"
)
