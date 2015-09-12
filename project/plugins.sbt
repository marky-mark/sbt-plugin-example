logLevel := Level.Warn

//Only seen for builds
libraryDependencies += "joda-time" % "joda-time" % "2.8.2"

unmanagedJars in Compile += file("lib/swagger-play-boostrap-assembly-0.1-SNAPSHOT.jar")