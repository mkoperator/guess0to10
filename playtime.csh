#! /bin/csh
clear
echo 'Welcome to Playtime!'

if ($#argv < 1) then
    @ maxnum = 10
else 
    @ maxnum = $1
endif

@ compnum = `awk -vmin=1 -vmax=$maxnum 'BEGIN{srand(); print int(min+rand()*(max-min+1))}'`

echo "Guess a number between 1 and $maxnum?"
@ yournum=$<
stty echo

if ($yournum > $maxnum) then
    echo "Dude, you are not in the specified number range!"
endif

if ($yournum == $compnum) then
    echo "You correctly guessed $compnum! Good job!";
else
    echo "Sorry! The correct number is $compnum. ";
endif

echo "";
echo "Thanks for playing! Do you want to play again? [y/N]"
set playagain=$<
stty echo

if ($playagain =~ "y" || $playagain =~ "Y") then
 exec playtime.csh $maxnum
endif
