name := """shell"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

seq(Revolver.settings: _*)