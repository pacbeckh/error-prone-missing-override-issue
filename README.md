# error-prone-missing-override-issue

`RemoveUnusedImports` is reported for the `SomeClass` file.

Executing `mvn clean install` results in :

```
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project errorproneissue: Compilation failure
[ERROR] /Users/pacovanbeckhoven/hexagon/error-prone-missing-override-issue/src/main/java/org/example2/SomeClass.java:[3,1] [RemoveUnusedImports] Unused imports: lombok.Builder
[ERROR]     (see https://errorprone.info/bugpattern/RemoveUnusedImports)
[ERROR]   Did you mean to remove this line?
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```
