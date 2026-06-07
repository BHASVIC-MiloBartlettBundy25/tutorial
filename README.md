Notes

Random numbers go from 0 to the input number in Greenfoot.getRandomNumber
The size of the world impacts the background screen and how many times it shows
setImage("example.png"); can change the image, so long as the image is a past image of the actor in the set image space
Greenfoot.mouseClicked(null) triggers when mouse is clicked
setLocation should be used instead of move as the actors are often at a weird angle in games
getOneIntersectingObject(Cheese.class) can check for touching objects of a paticular class
|| is or in java for Greenfoot
Greenfoot.stop(); stops the game and should be done after a win or loss
a superclass with no data can be done to make it so all can be detected as a group through note 8
not all objects need code as code can be on the side of the other actors
you should move code out of act and into other functions that are run in act to make act cleaner
act can be put in the world class to be run every tick
it is better to move into a wall then back out than not be allowed to go into a wall to avoid bugs
time mechanics for a variable that incriments every tick can be used for randomness or regular action
sometimes errors are in the save world option so it is better to do it manually
commenting is //
the only thing you can run after getWorld().removeObject(this); is Greenfoot.stop();
Greenfoot.isKeyDown("v") should be used for holding keyboard controls
you can rotate actors with setRotation(r) if you dont like the angle in greenfoot
variable++; means up it by one
you shouldn't name your enemies enemy1 and enemy2 or it will destroy the save world data
one function of move can be in a superclass and run from the subclasses
Greenfoot.isKeyDown("right") is for the right arrow key
Greenfoot.isKeyDown("left") is for the left arrow key
getX() takes the x of the actor
getY() takes the y of the actor
you can change the name of an actor in the code at the top
