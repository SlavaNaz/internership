plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    testImplementation(gradleTestKit())
    testImplementation("junit", "junit", "4.12")
}