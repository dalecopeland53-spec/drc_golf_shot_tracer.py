plugins {
    id("com.android.application")
}

android {
    namespace = "com.bettergolf.app"
    compileSdk = 36

    // FIXED: Explicitly declare the signingConfigs fallback container block first
    signingConfigs {
        getByName("debug") {
            // Inherits your system's default local debug signing credentials securely
        }
    }

    defaultConfig {
        // RECOMMENDED: Aligned with your native package namespaces for clean sync paths
        applicationId = "com.bettergolf.app"
        minSdk = 26
        targetSdk = 36
        versionCode = 14
        versionName = "1.0.14"
    }

    buildTypes {
        getByName("release") {
            isDebuggable = false
            isMinifyEnabled = false
            // FIXED: Safely hooks the pre-declared debug credential profile container
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}
