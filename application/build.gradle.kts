plugins {
    id("org.springframework.boot") version ("2.2.0.RELEASE")
    id("io.spring.dependency-management") version ("1.0.8.RELEASE")
    id("java")
}


group = "dev.sayem"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":blog"))
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}

//test {
//    useJUnitPlatform()
//}
