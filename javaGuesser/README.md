# Documentation for Guesser class

## Instnce variables
```
Scanner input using system.in
```

## Static methods

### main()
```
Calls constructor for Guesser class
```

## Instance methods

### constructor (basically main)
```
make String response, set it to the empty string
make Boolean keepGoing, set it to true
while keepGoing
    call printMenu() to print the menu to the console
    use input.nextLine() to set response to what the user inputs
    if response is 0
        set keepGoing to false
    if response is 1
        call humanGuesser()
    if response is 2
        call computerGuesser()
    if response is anything else
        ask the user to enter one of the viable options
```

### void printMenu()
```
prompt the user to input a number corresponding to different menu options
print the options to the console
```

### void humanGuesser()
```
make int number, use Math.random() to set it to a value between 1-100
make int turns, set it to 0
make String guess, set it to the empty string
make Boolean keepGoing, set it to true
while keepGoing
    increment turns by 1
    ask the user to guess a number using input.nextInt(), save their response to guess
    if guess is greater than number
        tell the user their guess is too high
    if guess is less than number
        tell the user their guess is too low
    if guess is equal to number
        tell the user their guess is correct
        set keepGoing to false
```

### void computerGuesser()
```
make int lower, set it to 1
make int upper, set it to 100
make int guess, set it to the mean of lower and upper
make int turns, set it to 0
make String response, set it to the empty string
make Boolean keepGoing, set it to true
while keepGoing
    increment turns by 1
    calculate the computer's guess, this is done by getting the mean of lower and upper
    ask the user for a response about if the guess is too high, too low, or correct, and save their input to response
    if response is too high
        set upper to guess
    if response is too low
        set lower to guess
    if response is correct
        set keepGoing to false
```
