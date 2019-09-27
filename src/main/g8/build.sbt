name := "$name$"

version := "0.1-SNAPSHOT"

scalaVersion := "2.13.1"


lazy val akkaVersion = "$akka_version$"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
)

javacOptions += "-Xlint:deprecation"

scalacOptions += "-deprecation"

