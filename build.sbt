name := "Scala Hello World"

scalaVersion := "2.12.2" // or any other Scala version >= 2.10.2

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.8" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

