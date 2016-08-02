process.stdin.resume();
process.stdin.setEncoding('ascii');


process.stdin.on('end', function() {
  process.stdout.write('end');
});

process.stdin.on('data', function(chunk) {
   process.stdin.pause();
   solution(chunk);
});

function solution(data){
    var data = data.split('');
    data.splice(data.lastIndexOf('\n'),1);
    var str = data.join('');
    var len = str.length;
    var resObj = {};
    for(var i = 0; i < len; i++ ){
        var arr1 = deleteItem(str, i);
        for(var j = 0; j< arr1.length;j++){
            var res = deleteItem(arr1, j);
            if(resObj[res]){
                resObj[res] +=1;
            }else{
                resObj[res] = 1;
            }

        }
    }
    var result = 0;
    for(var item in resObj){
        result+=1;
    }
    console.log(result);
}

function deleteItem(str, index){
    var arr = str.split('');
    arr.splice(index, 1);
    return arr.join('');
}

