rootProject.name = "ec-config-template"

pluginManagement {
    repositories {
        mavenCentral()
    }

    buildscript {
        repositories {
            mavenCentral()
            flatDir {
                dirs("plugin")
            }
        }
        dependencies {
            classpath("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
            classpath(":socotra-ec-config-developer")
        }
    }
}
