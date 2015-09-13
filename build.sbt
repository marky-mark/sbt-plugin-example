import swaggerboot.PlaySkeletonBootstrap

name := "sbt-plugin-example"

version := "1.0"

scalaVersion := "2.11.7"

val genTask = TaskKey[Unit]("gen", "Generate")

genTask := {
  PlaySkeletonBootstrap.main(Array("", "", "-client"))
}