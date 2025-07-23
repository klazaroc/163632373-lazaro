@echo off
title Conditional

echo Enter your name:
:menu
echo.
echo -----------------------------
echo           CHOICES
echo -----------------------------
echo 1. IP Config
echo 2. Task List
echo 3. Task Kill
echo 4. Format (Warning!)
echo 5. Defragmentation
echo 6. Find
echo 7. Attrib
echo 8. Exit
echo ----------------------------
set /p choice="Enter your choice: "


if "%choice%"=="1" (
cls
ipconfig
echo.
pause
goto menu
)

if "%choice%"=="2" (
cls
tasklist
echo.
pause
goto menu
) 

if "%choice%"=="3" (
set /p pname="Enter the process name to kill (e.g. notepad.exe): "
    if "%pname%"=="" (
        echo Invalid input. Process name cannot be empty.
        pause
        goto menu
    )
taskkill /IM "%pname%" /F
echo.
pause
goto menu
)

if "%choice%"=="4" (
echo Try another option.
pause
goto menu
)

:: if "%choice%"=="4" (
::    cls
::    echo WARNING: This will ERASE all data on a drive!
::    set /p drive="Enter the drive letter to format (e.g. E:): "
::    if "%drive%"=="" (
::        echo Drive letter cannot be empty.
::        pause
::        goto menu
::    )
::    echo Are you sure you want to format %drive%? (Y/N)
::    set /p confirm="> "
::    if /i "%confirm%"=="Y" (
::        format %drive% /FS:NTFS /Q
::    ) else (
::        echo Format cancelled.
::    )
::    pause
::    goto menu
::)

if "%choice%"=="5" (
cls
set /p drive="Enter drive letter to defragment (C:/D:/E: etc): "
    if "%drive%"=="" (
        echo Drive letter cannot be empty.
        pause
        goto menu
    )
defrag %drive%:
echo.
pause
goto menu
)

if "%choice%"=="6" (
cls
set /p ftext="Enter text to search: "
set /p file="Enter file to search in (e.g. notes.txt): "
    if "%ftext%"=="" (
        echo Text to search cannot be empty.
        pause
        goto menu
    )
    if not exist "%file%" (
        echo File not found!
        pause
        goto menu
    )
find "%ftext%" "%file%"
echo.
pause
goto menu
)

if "%choice%"=="7" (
cls
set /p path="Enter file or folder path to check attributes: "
    if "%path%"=="" (
        echo Path cannot be empty.
        pause
        goto menu
    )
attrib "%path%"
echo.
pause
goto menu
)

if "%choice%"=="8" (
echo.
echo Goodbye!
pause
exit

echo Invalid input. Please enter a number from 1 to 8.
pause
goto menu
) 