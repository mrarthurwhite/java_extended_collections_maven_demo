This project demonstrates the use of Maven the build tool.

1.  Your site is ready to be published at https://mrarthurwhite.github.io/java_extended_collections_maven_demo/

2. MOST IMPORTANT & COMMON USE: it automatically downloads the necessary dependencies (or jar files or libraries) when you build the project.

2.1 forgot to use imports in the java file because the jars were not downloaded


3. Using :
https://www.vogella.com/tutorials/EclipseMaven/article.html

Although build fails with error 
[ERROR] No compiler is provided in this environment. Perhaps you are running on a JRE rather than a JDK?

https://java2blog.com/no-compiler-provided-environment-perhaps-running-jre-rather-jdk/
I have added JDK 12 but it does not seem to understand
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project java-extended-collections: Compilation failure
[ERROR] No compiler is provided in this environment. Perhaps you are running on a JRE rather than a JDK?
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


