var arr = [3,5,7,1,2,4,9,0,1,5,2,3,3,3];

function bubbleSort(arr) {
    var len = arr.length;
    if (len === 0) {
        return arr;
    } else {
        var i = 0;
        var j = 0;
        for(; i<len; i++) {
            for(j = len-1; j > 0; j--){
                if(arr[j]<arr[j-1]){
                    var temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    return arr;
}

console.log(bubbleSort(arr));
