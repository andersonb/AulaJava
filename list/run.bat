@ECHO OFF
IF "%~1"=="c" GOTO compile
IF "%~1"=="r" GOTO run

:compile
  ECHO compilando..
  javac -cp build src/com/test/*.java -d build
GOTO End1

:run
  ECHO rodando..
  java -cp build com.test.App
GOTO End1

:End1
