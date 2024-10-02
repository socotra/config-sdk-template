rootProject.name = "ec-config-template"

pluginManagement {
    repositories {
        mavenCentral()
    }

    buildscript {
        repositories {
            flatDir {
                dirs("plugin")
            }
        }
        dependencies {
            classpath(":socotra-ec-config-developer")
        }
    }
}
