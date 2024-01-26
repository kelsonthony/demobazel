#Commands

bazel clean --expunge

bazel sync --configure

bazel build //...

bazel query @maven//...

bazel run @maven//:pin

bazel run @unpinned_maven//:pin

bazel run //demobazel/src/main/java/com/kelsonthony/demobazel/demobazel:app


--add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED


## old dependencies

"@maven//:org_springframework_boot_spring_boot",
"@maven//:org_springframework_boot_spring_boot_autoconfigure",
"@maven//:org_springframework_boot_spring_boot_starter_web",
"@maven//:org_springframework_spring_context",
"@maven//:org_springframework_spring_web",
"@maven//:org_springframework_data_spring_data_jpa",
"@maven//:jakarta_persistence_jakarta_persistence_api",
"@maven//:org_springframework_boot_spring_boot_starter_data_jpa",
"@maven//:org_slf4j_slf4j_nop",
"@maven//:com_h2database_h2",


from workspace 

"org.slf4j:slf4j-nop:2.0.7",
"org.hamcrest:hamcrest-library:1.3",
"org.springframework.boot:spring-boot-autoconfigure:2.7.17",
"org.springframework.boot:spring-boot-test-autoconfigure:2.7.17",
"org.springframework.boot:spring-boot-test:2.7.17",
"org.springframework.boot:spring-boot:2.7.17",
"org.springframework.boot:spring-boot-starter-web:2.7.17",
"org.springframework:spring-beans:5.3.30",
"org.springframework:spring-context:5.3.30",
"org.springframework:spring-test:5.3.30",
"org.springframework:spring-web:5.3.30",
"org.springframework.boot:spring-boot-starter-data-jpa:2.7.17",
"jakarta.annotation:jakarta.annotation-api:1.3.5",
"jakarta.xml.bind:jakarta.xml.bind-api:2.3.2",
"org.glassfish.jaxb:jaxb-runtime:2.3.2",
"com.h2database:h2:2.2.224",