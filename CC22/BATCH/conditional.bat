@echo off

:menu
echo.
echo C - Circle
echo T - Triangle
echo Q - Quadreilateral
echo E - Exit
choice /c CTQE /m "Choose an option:"

if errorlevel 4 goto end       
if errorlevel 3 goto quad      
if errorlevel 2 goto triangle  
if errorlevel 1 goto circle    

:circle
echo.
echo Input radius: 
set /p radius=
set /a area=22*%radius%*%radius%/7
echo Approximate area = %area%
goto menu

:triangle
echo.
echo Input side 1: 
set /p side1=
echo Input side 2:
set /p side2=
echo Input side 3:
set /p side3=

if "%side1%"=="%side2%" if "%side2%"=="%side3%" (
    set type=Equilateral
) else if "%side1%"=="%side2%" (
    set type=Isosceles
) else if "%side1%"=="%side3%" (
    set type=Isosceles
) else if "%side2%"=="%side3%" (
    set type=Isosceles
) else (
    set type=Scalene
)

echo Triangle Type: %type%
goto menu

:quad
echo.
echo Enter length:
set /p length=
echo Enter width:
set /p width=
set /a area=%length% * %width%
echo Area: %area%

if "%length%"=="%width%" (
    echo This is a Square.
) else (
    echo This is a Rectangle.
)
goto menu

:end
echo.
echo Goodbye!
pause
Exit /b