# Produzione di Borse — Simulazione con Thread in Java

## 1. Descrizione
Questo progetto simula la produzione di borse usando thread in Java.
Ogni thread rappresenta una fase della produzione, eseguita in parallelo.

## 2. Struttura del progetto
- Main → avvia il programma
- GestoreProcesso → gestisce i thread
- CucitoreBorse → simula la cucitura e assemblaggio
- LucidatoreBorse → simula lucidatura e controllo qualità

## 3. Funzionamento
- Il GestoreProcesso crea due thread: cucitore e lucidatore
- I thread vengono avviati con start() e il processo principale li aspetta con join()
- Ogni thread usa Thread.sleep() per simulare i tempi di lavoro
- I messaggi a video mostrano le fasi della produzione

## 4. Commenti Javadoc
Ogni classe e metodo contiene commenti Javadoc. 

## 5. UML del progetto
È incluso un file UML.pdf con 3 classi principali:
- GestoreProcesso
- CucitoreBorse
- LucidatoreBorse

## 6. Obiettivo
Mostrare come simulare processi paralleli usando thread, sleep e join in Java.

## 7. Autore
Rossi Andrea del 5Cinf
