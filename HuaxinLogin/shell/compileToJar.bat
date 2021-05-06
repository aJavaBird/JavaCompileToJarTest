@echo off

:: 延迟环境变量扩充，是为了后面的 set srcFiles=!srcFiles! %%i 能够正确的扩充，否则会出现每次赋值都取最后一次赋值的问题
setlocal enabledelayedexpansion

set PROJECT_DIR=C:\Users\Administrator\Desktop\JavaCompileToJarTest\HuaxinLogin

cd %PROJECT_DIR%

IF EXIST %PROJECT_DIR%\bin ( 
    rd /s/q %PROJECT_DIR%\bin
    )
md bin
where /R src /F *.java > src/source.list

set srcFiles=
for /f "tokens=*" %%i in (%PROJECT_DIR%\src\source.list) do (
::	set srcFiles=%srcFiles% %%i
	set srcFiles=!srcFiles! %%i
)
javac -encoding utf-8 -d bin !srcFiles!
DEL /f /s /q src\source.list
echo "Compile finish,next is package"

if not exist target (
	md target
)

jar -cvf target/ghbLoginTest.jar -C bin/ .

pause
