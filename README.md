# error-prone-missing-override-issue
Created to support https://github.com/google/error-prone/issues/4065

Generates `MissingOverride` errors for methods that have the `@Generated` annotation.

Executing `mvn clean install` results in :

```
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project errorproneissue: Compilation failure: Compilation failure: 
[ERROR] /Users/pacovanbeckhoven/hexagon/error-prone-missing-override-issue/src/main/java/org/example/AnyClassDeLombok.java:[12,17] [MissingOverride] getAnything implements method in AnyInterface; expected @Override
[ERROR]     (see https://errorprone.info/bugpattern/MissingOverride)
[ERROR]   Did you mean '@Override @Generated'?
[ERROR] /Users/pacovanbeckhoven/hexagon/error-prone-missing-override-issue/src/main/java/org/example/AnyClass.java:[8,18] [MissingOverride] getAnything implements method in AnyInterface; expected @Override
[ERROR]     (see https://errorprone.info/bugpattern/MissingOverride)
[ERROR]   Did you mean 'private String @Override anything;'?
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```
