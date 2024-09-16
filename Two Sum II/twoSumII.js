
/**
 * 
 * my solution with javascript --> 
 * 
 */


 class solution {
    twoSum (numbers, target) {
     let result = [];

     for (let i = 0; i < numbers.length - 1; i++) { 
        for (let j = i + 1; j < numbers.length; j++) { 

          if (numbers[i] + numbers[j] == target) {
              result.push(i + 1);
              result.push(j + 1);
           }
        }
     }
   return result;
  }
}
 