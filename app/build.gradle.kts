plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
repositories {
    google()
    mavenCentral()
}
android {
    namespace = "com.example.miapp"
    compileSdk = 33
    defaultConfig {
        applicationId = "namespace = "com.example.traker"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
}
