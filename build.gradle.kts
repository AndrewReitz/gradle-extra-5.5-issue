plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.31"
    application
}

repositories {
    jcenter()
}

extra["stdLibVersion"] = "1.3.31"

dependencies {
    kotlinStd
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "cash.andrew.AppKt"
}

inline val DependencyHandler.kotlinStd get() = implementation("com.android.tools.build:gradle:${extra["stdLibVersion"]}")
