name := "clientSpark"

version := "0.1"

scalaVersion := "2.11"

libraryDependencies ++= {
  val sparkVer = "2.2.1"
  Seq {
    "org.apache.spark" %% "spark-core" % sparkVer
  }
}