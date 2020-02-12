# roman-numerals
Converts Roman numerals to Arabic numerals and Arabic to Roman

Satisfies requirements from http://agilekatas.co.uk/katas/romannumerals-kata

Convert Arabic Number to Roman Numeral
--------------------------------------
As a game developer
I want to be able to convert a number to a numeral
So that I can label my game releases using Roman numerals

Given I have started the converter
When I enter $number
Then $numeral is returned

## Test Cases
|Number|Numeral|
| ----- | :--- |
|1|I|      I
|3|III|
|9|IX|
|1066|	MLXVI |
|1989	| MCMLXXXIX |



Convert Roman Numeral to Number
-------------------------------------
As a marketing manager
I want customers to be able to convert numerals to numbers
So that they can buy the latest version of the game

Given I have started the converter
When I enter $numeral
Then $number is returned

## Test Cases
|Numeral|Number|
| ---- | :--- |
|I|1|
|III|3|
|IX|9|
|MLXVI|1066|
|MCMLXXXIX|1989|






