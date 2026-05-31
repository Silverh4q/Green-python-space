pluginManagement {
  repositories {
    google {
      content {
        includeGroupByRegex("com\\.android.*")
        includeGroupByRegex("com\\.google.*")
        includeGroupByRegex("androidx.*")
      }
    }
    mavenCentral()
    gradlePluginPortal()
  }
}

plugins { id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0" }

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
  }
}

val f = java.io.File("/opt/android/sdk/ndk")
if (f.exists()) {
    println("NDK DIR SETTINGS: " + f.list()?.joinToString())
    val f1 = java.io.File("/opt/android/sdk/ndk/27.0.12077973")
    println("NDK 27 size: " + f1.list()?.size)
    val f2 = java.io.File("/opt/android/sdk/ndk/26.1.10909125")
    println("NDK 26 size: " + f2.list()?.size)
}

rootProject.name = "My Application"

include(":app")
