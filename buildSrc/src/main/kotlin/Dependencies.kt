const val kotlinVersion = "1.3.61"

object BuildPlugins {
    object Versions {
        const val buildToolsVersion = "3.5.3"
        const val junit = "1.5.2.0"
    }

    const val androidGradleClasspath = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradleClasspath = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val junitClasspath = "de.mannodermaus.gradle.plugins:android-junit5:${Versions.junit}"

    const val applicationPlugin = "com.android.application"
    const val kotlinPlugin = "kotlin-android"
    const val kotlinExtensionsPlugin =  "kotlin-android-extensions"
    const val junitPlugin =  "de.mannodermaus.android-junit5"
}

object AndroidSdk {
    const val min = 22
    const val compile = 28
    const val target = compile
}

object Libraries {
    private object Versions {
        const val jetpack = "1.0.2"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.jetpack}"
}

object TestLibraries {
    private object Versions {
        const val junit = "5.5.2"
    }

    const val junit = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
    const val junitEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
}