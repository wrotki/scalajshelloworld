lazy val root = project.
  enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.8" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

