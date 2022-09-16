echo off

set contrato=%USERPROFILE%\documents\copiar
set local=%USERPROFILE%\documents\copiado

robocopy %contrato% %local% 

for %f in (*.txt) do type %f