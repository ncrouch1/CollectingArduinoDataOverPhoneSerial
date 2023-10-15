pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

sourceControl {
    gitRepository(java.net.URI("https://github.com/felHR85/UsbSerial.git")) {
        producesModule("com.github.felHR85")
    }
}

rootProject.name = "datacollection"
include(":app")
