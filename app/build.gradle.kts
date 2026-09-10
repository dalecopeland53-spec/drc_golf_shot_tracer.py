plugins {
    id("com.android.application")
}

android {
    namespace = "com.bettergolf.app"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.dalecopeland.drcshottracker"
        minSdk = 26
        targetSdk = 36
        versionCode = 2
        versionName = "1.0.1"
    }
}
