var arr = [3,5,7,1,2,4,9,0,1,5,2,3,3,3,15,18,31,21,11,32,27];

function quickSort(arr) {
    var len = arr.length;
    if(len === 0 || len === 1){
        return arr;
    }
    var posVal = arr.splice(Math.floor(arr.length/2),1);
    var left = [];
    var right = [];
    var i = 0;
    for(; i < arr.length; i++) {
        if(arr[i] < posVal){
            left.push(arr[i]);
        }else {
            right.push(arr[i]);
        }
    }
    return quickSort(left).concat(posVal).concat(quickSort(right));
} 

console.log(quickSort(arr));