@echo off
echo 🚀 Compiling all Java files...
for /R src %%f in (*.java) do (
    javac -d bin "%%f"
)
echo ✅ Compilation complete.
pause