plugins {
    id("com.android.application")
}

android {
    namespace = "com.bettergolf.app"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.drc.shottracker.release14"
        minSdk = 26
        targetSdk = 36
        versionCode = 14
        versionName = "1.0.14"
    }

    buildTypes {
        getByName("release") {
            isDebuggable = false
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}
