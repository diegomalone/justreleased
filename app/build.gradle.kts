plugins {
    id(BuildPlugins.applicationPlugin)
    id(BuildPlugins.kotlinPlugin)
    id(BuildPlugins.kotlinExtensionsPlugin)
    id(BuildPlugins.junitPlugin)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        applicationId = "com.diegomalone.justreleased"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile ("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)

    testImplementation(TestLibraries.junit)
    testRuntimeOnly(TestLibraries.junitEngine)
}
