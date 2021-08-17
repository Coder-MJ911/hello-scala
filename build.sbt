name := "testStudyScala"

version := "0.1"

scalaVersion := "2.13.3"

val Http4sVersion = "0.21.2"
libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-core" % Http4sVersion,
  "org.http4s" %% "http4s-dsl" % Http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % Http4sVersion,
  "org.http4s" %% "http4s-circe" % Http4sVersion,
  "io.circe" %% "circe-core" % "0.13.0",
  "io.circe" %% "circe-generic" % "0.13.0",
)