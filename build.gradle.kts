plugins {
    java
    id("socotra-ec-config-developer")
}

`socotra-config-developer` {
    apiUrl.set(System.getenv("SOCOTRA_KERNEL_API_URL") ?: "http://hardcoded-fallback-tenant-url")
    tenantLocator.set(System.getenv("SOCOTRA_KERNEL_TENANT_LOCATOR") ?: "hardcoded-fallback-tenant-locator")
    personalAccessToken.set(System.getenv("SOCOTRA_KERNEL_ACCESS_TOKEN") ?: "hardcoded-fallback-access-token")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}
