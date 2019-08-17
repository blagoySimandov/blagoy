var array = [1,2,3,4,5,6,7,8,9];
function binarySearch(arr, x) {
let lowIndex = 0;
let highIndex = arr.length - 1;
while (lowIndex <= highIndex) {
let midIndex = Math.floor((lowIndex + highIndex) / 2);
    if (x == arr[midIndex]) {return midIndex;}
   else if (x < arr[midIndex] ){
    highIndex = midIndex - 1;
        }
        else {
            lowIndex = midIndex + 1;
        }
    } return null;
}

console.log(binarySearch(array,3));