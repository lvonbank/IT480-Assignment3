# it480-assignment3


//* Navigate to this folder to run both */
cd it480-assignment3/


//* Runs the main CoffeeMaker program */
java CoffeeMaker.CoffeeMaker


//* Runs the Junit tests */
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore UnitTest.RoomTest UnitTest.PlayerTest UnitTest.HouseTest UnitTest.GameTest
