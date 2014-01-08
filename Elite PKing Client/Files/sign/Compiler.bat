@echo off
color 77
title AytonScape Client Compiler
echo ========================
echo ==Type 'c' for compile==
echo ==  Type 'r' for run  ==
echo ========================
echo Type any other to close
:def
set /p compile=Option:
if %compile%==c goto compile
if %compile%==C goto compile
if %compile%==r goto run
if %compile%==R goto run
:compile
"%programfiles%\java\jdk1.6.0_07\bin\javac.exe" *.java
pause
goto def
:run
JAVA -Xmx500m EGUI
pause