<?php 
		//handle session to keep number of dice and sides for multiple use
		
		session_register('numOfDiceToRoll');
		session_register('numOfDiceSides');
?>

<html>
<body>

	<?php
	

		
		// start variables 
 	 	$numOfDiceToRoll = $_POST["numOfDice"]; 
		$numOfDiceSides = $_POST["numOfSides"]; 
		$numOfRolls = $numOfDiceToRoll;
		$startingCount = 0;
		
		//function to call random number for roll
		function randomRoll($max)
			{
				$rollResult = rand(1, $max);
				echo $rollResult;	
				
  		}
  		
		//while to run random function once for each dice
		while($startingCount < $numOfDiceToRoll) 
			{
				$currentRoll = $startingCount+1;
				echo "Roll # " . $currentRoll . ": ";
				randomRoll($numOfDiceSides);
				echo "<br>";
				$startingCount++;
			}  	
  	
 ?>
 <!-- start of html -->
  </br>
  
<form action="Dice.php" method="post">
Number of Dice: <input type="text" name="numOfDice">
Number of Side: <input type="text" name="numOfSides">
<input type="submit" value="Roll Dice">
</form>
</br>
</br>
<font><a href="mailto:kunningklown@gmail.com"> Email Suggestions </a></font>

</body>
</html>