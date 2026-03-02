## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

### ///     Problema 1-java      ///
Să se definească o clasa Complex pentru operații cu numere complexe și să se testeze
metodele implementate. Clasa va avea doi constructori astfel:
• cu două argumente(partea reală și imaginară)
• fără argumente
Metodele necesare sunt: adunare, înmulțire, ridicare la putere naturală, Equals și toString (șir
de forma (re,im)).

### ///     Problema 2-java      ///
Să se definească o clasa Stiva pentru stive de numere întregi, reprezentate prin vectori
intrinseci. Datele clasei:
• un vector de întregi
• indicele elementului din vârful stivei (ultimul introdus)
Metodele clasei:
• Constructor fara parametri (dimensiunea implicită a stivei = 100)
• Constructor cu parametru dimensiunea stivei
• void Push(int) : pune un întreg dat pe stivă
• int Pop() : scoate elementul din vârful stivei
• boolean isEmpty(): verifica daca stiva este goala
Considerati cazurile de stiva plina (la push) si stiva goala (la pop). Metoda statică main pentru
verificarea operațiilor cu o stiva va fi inclusă în clasa Stiva.

### ///     Problema 3-java      ///

Sa se defineasca o clasa Matrix pentru operații uzuale cu matrice patratice de numere reale:
adunare, înmulțire, toString. Sa se scrie un program pentru ridicarea la o putere întreagă a
unei matrice pătratice.

### ///     Problema 8-java    ///
Modificați metoda compareTo(...) din clasa Student astfel incat ordonarea:
    a) Să se efectueze individual după: nume, varsta și situație școlară (grade).
    b) Să se efectueze simultan după: nume, varsta și nota.
    c) Să se efectueze simultan după nume, varsta și nota, iar sortarea sa se realizeze
    folosind sort din Arrays.
## Obs. nu modificati structura claselor