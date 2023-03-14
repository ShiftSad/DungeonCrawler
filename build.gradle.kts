plugins {
    application

    kotlin("jvm") version "1.7.21"
    kotlin("plugin.serialization") version "1.7.21"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "tech.shiftmc.dungeon"
version = "1.0.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
    maven(url = "https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")

    implementation("org.tinylog:tinylog-api-kotlin:2.5.0")
    implementation("org.tinylog:tinylog-impl:2.5.0")

    implementation("com.github.Minestom:Minestom:3ca74e00fa")

    // Terminal implementation
    implementation("com.varabyte.kotter:kotter-jvm:1.1.0-rc1")
}

tasks {
    val java = "17"

    compileKotlin {
        kotlinOptions { jvmTarget = java }
    }

    named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
        minimize()
    }
}

application {
    mainClass.set("tech.shiftmc.lobby.LobbyLoaderKt")
}
