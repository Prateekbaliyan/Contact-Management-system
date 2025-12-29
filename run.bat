@echo off
echo ==========================================
echo Contact Management App Runner
echo ==========================================

set MAVEN_HOME=C:\Users\prate\Desktop\SchoolManager\maven\apache-maven-3.9.5
set PATH=%MAVEN_HOME%\bin;%PATH%

echo Checking for Maven...
call mvn -version >nul 2>&1
if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Maven is still not found. Please check the path in this script.
    echo Expected at: %MAVEN_HOME%
    echo.
    pause
    exit /b 1
)

echo.
echo Maven found. Starting application...
echo.
call mvn spring-boot:run

if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Application failed to start.
    pause
    exit /b 1
)

