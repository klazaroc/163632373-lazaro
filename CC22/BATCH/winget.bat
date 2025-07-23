@echo off
title Winget Batch File
setlocal enabledelayedexpansion

:: Check for Winget
where winget >nul 2>&1
if errorlevel 1 (
    echo Winget is not installed. Please update Windows or install App Installer from Microsoft Store.
    pause
    exit
)

:menu
cls
echo ==============================
echo       Developer Toolkit
echo ==============================
echo 1. List all installed apps
echo 2. Install Developer Apps
echo 3. Uninstall Bloatware
echo 4. Update All Software
echo 5. Restart/Shutdown
echo 6. Exit
echo ------------------------------
set /p choice="Enter your choice: "

if "%choice%"=="1" (
cls
echo Installed applications:
winget list
echo.
pause
goto menu
)

if "%choice%"=="2" (
cls
echo What do you want to install?
echo a. Visual Studio Code
echo b. Python
echo c. Java
echo d. Node.js
echo e. All of the above
echo f. Back to menu
set /p install_choice="Enter your choice: "

    if /i "%install_choice%"=="a" winget install --id Microsoft.VisualStudioCode -e
    if /i "%install_choice%"=="b" winget install --id Python.Python.3 -e
    if /i "%install_choice%"=="c" winget install --id Oracle.JavaRuntimeEnvironment -e
    if /i "%install_choice%"=="d" winget install --id OpenJS.NodeJS -e
    if /i "%install_choice%"=="e" (
        winget install --id Microsoft.VisualStudioCode -e
        winget install --id Python.Python.3 -e
        winget install --id Oracle.JavaRuntimeEnvironment -e
        winget install --id OpenJS.NodeJS -e
    )
pause
goto menu
)

if "%choice%"=="3" (
 cls
echo Uninstalling common bloatware...
powershell -Command "Get-AppxPackage *xbox* | Remove-AppxPackage"
powershell -Command "Get-AppxPackage *cortana* | Remove-AppxPackage"
powershell -Command "Get-AppxPackage *bing* | Remove-AppxPackage"
powershell -Command "Get-AppxPackage *zune* | Remove-AppxPackage"
powershell -Command "Get-AppxPackage *solitaire* | Remove-AppxPackage"
echo Done.
pause
goto menu
)

if "%choice%"=="4" (
cls
echo Updating all installed software via winget...
winget upgrade --all
echo Done.
pause
goto menu
)

if "%choice%"=="5" (
cls
pause
shutdown /r /t 0
exit
)

if "%choice%"=="6" (
    echo Goodbye!
    pause
    exit
)

echo Invalid choice. Try again.
pause
goto menu