var arr = [3,5,7,1,2,4,9,0,1,5,2,3,3,3];

function selectSort(arr) {
    var len = arr.length;
    var i = 0;
    var j = 0;
    var min = 0;
    for(; i<len; i++){
        for(j = i+1; j<len;j++){
            if(arr[min] > arr[j]){
                min = j;  // 维持最小数值的索引
            }
        }
        var temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    return arr;
}

console.log(selectSort(arr));