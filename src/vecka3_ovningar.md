# Vecka 3: Övningar - Statiska metoder och kodorganisation

## Dag 1: Grundläggande metoder

### Övning 1.1: Första metoden
```java
// Skapa ett program som:
// 1. Har en main-metod som skriver "Programmet startar"
// 2. Anropar en metod som heter printWelcome()
// 3. printWelcome() ska skriva ut en välkomsttext
// 4. main skriver sedan "Programmet avslutas"

// Förväntad output:
// Programmet startar
// Välkommen till mitt program!
// Programmet avslutas
```

### Övning 1.2: Metoder med parametrar
```java
// Skapa metoder för:
// 1. printName(String name) - skriver ut "Ditt namn är: [name]"
// 2. printAge(int age) - skriver ut "Du är [age] år gammal"
// 3. printGreeting(String name, int age) - kombinerar ovan
// 4. I main: anropa alla tre metoder med olika värden
```

### Övning 1.3: Första returvärdet
```java
// Skapa metoder som returnerar värden:
// 1. getName() - returnerar ditt namn som String
// 2. getAge() - returnerar din ålder som int
// 3. getFullPresentation() - returnerar en komplett presentation
// 4. I main: använd alla metoder och skriv ut resultaten
```

## Dag 2: Matematiska metoder

### Övning 2.1: Grundläggande matematik
```java
// Skapa metoder för:
// 1. add(int a, int b) - returnerar summan
// 2. subtract(int a, int b) - returnerar differensen
// 3. multiply(int a, int b) - returnerar produkten
// 4. divide(double a, double b) - returnerar kvoten
// 5. I main: testa alla metoder med olika tal
```

### Övning 2.2: Geometriska beräkningar
```java
// Skapa metoder för:
// 1. calculateCircleArea(double radius) - returnerar cirkelns area
// 2. calculateRectangleArea(double length, double width) - rektangelns area
// 3. calculateTriangleArea(double base, double height) - triangelns area
// 4. I main: skapa en "area-kalkylator" som använder alla metoder
```

### Övning 2.3: Avancerade matematiska funktioner
```java
// Skapa metoder för:
// 1. power(double base, int exponent) - beräknar base^exponent
// 2. factorial(int n) - beräknar n! (n faktorial)
// 3. isPrime(int number) - kontrollerar om ett tal är primtal
// 4. fibonacci(int n) - returnerar det n:te fibonacci-talet
// 5. I main: testa alla funktioner
```

## Dag 3: String-metoder

### Övning 3.1: Texthantering
```java
// Skapa metoder för:
// 1. reverseString(String text) - vänder på en sträng
// 2. countVowels(String text) - räknar vokaler (a,e,i,o,u,y)
// 3. countWords(String text) - räknar antal ord
// 4. capitalizeWords(String text) - gör första bokstaven i varje ord stor
// 5. I main: testa med olika texter
```

### Övning 3.2: Textvalidering
```java
// Skapa metoder för:
// 1. isValidEmail(String email) - kontrollerar om email är giltig
// 2. isValidPhoneNumber(String phone) - kontrollerar telefonnummer
// 3. isStrongPassword(String password) - kontrollerar lösenordsstyrka
//    (minst 8 tecken, innehåller siffra och stor bokstav)
// 4. I main: testa alla valideringsmetoder
```

### Övning 3.3: Textspel
```java
// Skapa metoder för ett ordspel:
// 1. generateRandomWord() - returnerar slumpmässigt ord från en array
// 2. hideWord(String word) - ersätter bokstäver med *
// 3. revealLetter(String hiddenWord, String originalWord, char guess)
//    - avslöjar gissade bokstäver
// 4. I main: skapa ett enkelt gissningsspel
```

## Dag 4: Array-metoder

### Övning 4.1: Array-statistik
```java
// Skapa metoder för:
// 1. findMax(int[] numbers) - hittar största värdet
// 2. findMin(int[] numbers) - hittar minsta värdet
// 3. calculateSum(int[] numbers) - summerar alla värden
// 4. calculateAverage(int[] numbers) - beräknar genomsnitt
// 5. I main: testa med olika arrays
```

### Övning 4.2: Array-manipulation
```java
// Skapa metoder för:
// 1. reverseArray(int[] numbers) - vänder på arrayen
// 2. sortArray(int[] numbers) - sorterar arrayen (använd Arrays.sort())
// 3. findElement(int[] numbers, int target) - hittar index för ett värde
// 4. removeElement(int[] numbers, int index) - tar bort element på index
// 5. I main: demonstrera alla metoder
```

### Övning 4.3: Array-analys
```java
// Skapa metoder för:
// 1. countEvenNumbers(int[] numbers) - räknar jämna tal
// 2. countOddNumbers(int[] numbers) - räknar udda tal
// 3. findDuplicates(int[] numbers) - hittar duplicerade värden
// 4. getUniqueElements(int[] numbers) - returnerar unika element
// 5. I main: analysera olika arrays
```

## Dag 5: Input-valideringsmetoder

### Övning 5.1: Säker input
```java
// Skapa metoder för säker input:
// 1. readPositiveInt(Scanner scanner) - läser positivt heltal
// 2. readIntInRange(Scanner scanner, int min, int max) - läser tal i intervall
// 3. readNonEmptyString(Scanner scanner) - läser icke-tom sträng
// 4. readYesOrNo(Scanner scanner) - läser ja/nej svar
// 5. I main: demonstrera alla input-metoder
```

### Övning 5.2: Specialiserade input-metoder
```java
// Skapa metoder för:
// 1. readGrade(Scanner scanner) - läser betyg (0-100)
// 2. readAge(Scanner scanner) - läser ålder (1-120)
// 3. readEmail(Scanner scanner) - läser giltig e-post
// 4. readPhoneNumber(Scanner scanner) - läser telefonnummer
// 5. I main: skapa ett registreringsformulär
```

## Dag 6: Refaktorering av gamla program

### Övning 6.1: Refaktorera miniräknare
```java
// Ta ditt miniräknare-program från vecka 1-2 och:
// 1. Skapa separata metoder för varje operation (+, -, *, /)
// 2. Skapa metod för att läsa tal från användaren
// 3. Skapa metod för att välja operation
// 4. Skapa metod för att visa resultat
// 5. Main-metoden ska bara anropa dessa metoder
```

### Övning 6.2: Refaktorera gissa-talet
```java
// Ta ditt gissa-talet-program och:
// 1. generateRandomNumber(int min, int max) - genererar slumpmässigt tal
// 2. getGuess(Scanner scanner) - läser gissning från användaren
// 3. compareGuess(int guess, int secret) - jämför gissning med hemligt tal
// 4. playGame() - huvudspel-loopen
// 5. Organisera om main-metoden
```

### Övning 6.3: Refaktorera quiz-program
```java
// Ta ditt quiz-program och:
// 1. displayQuestion(String question, String[] options) - visar fråga
// 2. readAnswer(Scanner scanner) - läser svar
// 3. checkAnswer(int userAnswer, int correctAnswer) - kontrollerar svar
// 4. calculateScore(int correct, int total) - beräknar poäng
// 5. displayResult(int score, int total) - visar slutresultat
```

## Dag 7: Method Overloading

### Övning 7.1: Överlagrade beräkningsmetoder
```java
// Skapa överlagrade metoder för:
// 1. calculate(int a, int b) - adderar två heltal
// 2. calculate(double a, double b) - adderar två decimaltal
// 3. calculate(int a, int b, int c) - adderar tre heltal
// 4. calculate(String operation, int a, int b) - utför angiven operation
// 5. I main: testa alla varianter
```

### Övning 7.2: Överlagrade print-metoder
```java
// Skapa överlagrade print-metoder:
// 1. print(String message) - skriver ut meddelande
// 2. print(String message, int times) - skriver ut meddelande X gånger
// 3. print(String message, boolean uppercase) - skriver ut i versaler om true
// 4. print(String[] messages) - skriver ut alla meddelanden i arrayen
// 5. I main: demonstrera alla varianter
```

## Dag 8: Komplex programorganisation

### Övning 8.1: Studiehanteringssystem
```java
// Skapa ett system med metoder för:
// 1. readStudentInfo(Scanner scanner) - läser studentinformation
// 2. readGrades(Scanner scanner, int numberOfSubjects) - läser betyg
// 3. calculateGPA(int[] grades) - beräknar GPA
// 4. determineStatus(double gpa) - avgör godkänd/underkänd
// 5. printTranscript(String name, int[] grades, double gpa) - skriver ut betygsutdrag
// 6. I main: koordinera hela flödet
```

### Övning 8.2: Bankkontos-simulator
```java
// Skapa metoder för:
// 1. createAccount(String name, double initialBalance) - skapar konto
// 2. deposit(double balance, double amount) - insättning
// 3. withdraw(double balance, double amount) - uttag
// 4. calculateInterest(double balance, double rate) - beräknar ränta
// 5. printAccountInfo(String name, double balance) - visar kontoinformation
// 6. I main: simulera bankoperationer
```

### Övning 8.3: Restaurangbeställningssystem
```java
// Skapa metoder för:
// 1. displayMenu() - visar meny
// 2. takeOrder(Scanner scanner) - tar emot beställning
// 3. calculateTotal(int[] items, double[] prices) - beräknar totalkostnad
// 4. applyDiscount(double total, double discountPercent) - applicerar rabatt
// 5. printReceipt(int[] items, String[] itemNames, double total) - skriver ut kvitto
// 6. I main: simulera restaurangbeställning
```

## Dag 9: Felhantering och robusthet

### Övning 9.1: Robusta input-metoder
```java
// Förbättra dina input-metoder med felhantering:
// 1. readIntWithRetry(Scanner scanner, String prompt) - fortsätter tills giltigt tal
// 2. readDoubleWithRetry(Scanner scanner, String prompt) - samma för decimaltal
// 3. readStringWithValidation(Scanner scanner, String prompt, int minLength)
// 4. readChoiceFromMenu(Scanner scanner, String[] options) - väljer från meny
// 5. I main: testa alla metoder med felaktig input
```

### Övning 9.2: Datavalidering
```java
// Skapa robusta valideringsmetoder:
// 1. validateGrade(int grade) - kontrollerar att betyg är 0-100
// 2. validateAge(int age) - kontrollerar rimlig ålder
// 3. validateEmail(String email) - grundläggande email-validering
// 4. validatePassword(String password) - lösenordskrav
// 5. validateInput(String input, String type) - generisk validering
```

## Dag 10: Stora projekt med metodorganisation

### Övning 10.1: Komplett skoladministrationssystem
```java
// Bygg ett komplett system med metoder för:
// 
// STUDENT-HANTERING:
// 1. createStudent(Scanner scanner) - skapa ny student
// 2. displayStudent(String name, int age, double gpa) - visa studentinfo
// 
// BETYG-HANTERING:
// 3. inputGrades(Scanner scanner, int numberOfSubjects) - mata in betyg
// 4. calculateGPA(int[] grades) - beräkna GPA
// 5. getLetterGrade(double gpa) - konvertera till bokstavsbetyg
// 6. isPassingGrade(double gpa) - kontrollera godkänt
// 
// RAPPORT-GENERERING:
// 7. generateStudentReport(String name, int[] grades, double gpa) - studentrapport
// 8. generateClassStatistics(double[] gpas) - klassstatistik
// 9. findTopStudent(String[] names, double[] gpas) - bästa student
// 
// MENY-SYSTEM:
// 10. displayMainMenu() - visa huvudmeny
// 11. handleMenuChoice(int choice, Scanner scanner) - hantera menyval
// 12. runProgram() - huvudprogram-loop
// 
// I main: anropa bara runProgram()
```

### Övning 10.2: Spelcenter med flera spel
```java
// Skapa ett spelcenter med metoder för:
// 
// GISSA TALET:
// 1. playGuessTheNumber(Scanner scanner) - gissa talet-spel
// 2. generateSecretNumber(int min, int max) - generera hemligt tal
// 3. getGuess(Scanner scanner, int min, int max) - läs gissning
// 4. provideHint(int guess, int secret) - ge ledtråd
// 
// QUIZ-SPEL:
// 5. playQuiz(Scanner scanner) - quiz-spel
// 6. askQuestion(String question, String[] options, int correct) - ställ fråga
// 7. calculateQuizScore(int correct, int total) - beräkna quizpoäng
// 
// ORDSPEL:
// 8. playWordGame(Scanner scanner) - ordspel
// 9. getRandomWord(String[] words) - välj slumpmässigt ord
// 10. displayWordProgress(String word, boolean[] guessed) - visa framsteg
// 
// ALLMÄNT:
// 11. displayGameMenu() - visa spelmeny
// 12. getPlayerStats(int wins, int losses) - visa spelarstatistik
// 13. playAgain(Scanner scanner) - fråga om användaren vill spela igen
```

## Avancerade övningar

### Övning A: Metodkedjor
```java
// Skapa metoder som kan användas tillsammans:
// 1. processText(String text) - grundläggande textprocessing
// 2. cleanText(String text) - ta bort extra mellanslag
// 3. capitalizeText(String text) - stora bokstäver
// 4. validateText(String text) - validera text
// 5. formatText(String text) - formatera för utskrift
// 
// Använd dem så här:
// String result = formatText(capitalizeText(cleanText(processText(userInput))));
```

### Övning B: Utility-metoder
```java
// Skapa en samling användbara hjälpmetoder:
// 1. formatCurrency(double amount) - formatera pengar
// 2. formatPercentage(double ratio) - formatera procent
// 3. formatDate(int day, int month, int year) - formatera datum
// 4. generateRandomString(int length) - generera slumpmässig sträng
// 5. repeatString(String str, int times) - upprepa sträng
// 6. truncateString(String str, int maxLength) - förkorta sträng
```

## Reflektion och utvärdering

### Självkontroll - Kan du:
- [ ] Skapa metoder med och utan parametrar?
- [ ] Skriva metoder som returnerar värden?
- [ ] Använda method overloading?
- [ ] Dela upp komplexa program i logiska metoder?
- [ ] Välja bra metodnamn och struktur?
- [ ] Refaktorera befintlig kod till metoder?

### Kodkvalitet - Kontrollera att dina metoder:
- [ ] Har beskrivande namn
- [ ] Gör en sak bra
- [ ] Har rimligt antal parametrar (max 4-5)
- [ ] Är lagom långa (max 20-30 rader)
- [ ] Återanvänds på flera ställen
- [ ] Gör main-metoden kortare och tydligare

### Vanliga fel att undvika:
- **För långa metoder** - dela upp i mindre delar
- **För många parametrar** - kanske behöver du en klass istället
- **Otydliga namn** - metodnamn ska förklara vad metoden gör
- **Metoder som gör flera saker** - dela upp ansvar
- **Inte återanvända kod** - samma kod på flera ställen bör vara en metod

### Förberedelse för vecka 4 (OOP):
- Tänk på vilka metoder som naturligt hör ihop
- Vilka data (variabler) används tillsammans med vissa metoder?
- Hur skulle det kännas att ha "Student" som en egen enhet istället för bara metoder?

Nästa vecka kommer vi att se hur metoder och data kan organiseras tillsammans i klasser - det är grunden för objektorienterad programmering!