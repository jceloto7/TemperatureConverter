plugins {
    id("java")
}

group = "org.masterj723"
version = "1.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "org.apache.commons",name = "commons-lang3",version = "3.12.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

}

tasks.test {
    useJUnitPlatform()
}