plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.lagradost.cloudstream3.gradle") version "0.1.0"
}

cloudstream {
    setRepo("https://github.com/abhi-buddy007/Cricfy-cloadstrem-repo")
}

android {
    namespace = "com.cricfy.plugin"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    val cloudstreamApiVersion = "pre-release"
    compileOnly("com.lagradost:cloudstream3:$cloudstreamApiVersion")
}
